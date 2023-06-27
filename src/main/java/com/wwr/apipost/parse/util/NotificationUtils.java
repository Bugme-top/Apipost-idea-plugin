package com.wwr.apipost.parse.util;

import com.intellij.notification.*;
import com.intellij.openapi.actionSystem.AnAction;
import com.wwr.apipost.config.DefaultConstants;

/**
 * 消息通知工具类.
 */
//@SuppressWarnings("unchecked all")
public final class NotificationUtils {
    public static final NotificationGroup DEFAULT_GROUP = NotificationGroupManager.getInstance()
            .getNotificationGroup(DefaultConstants.NAME);

    /**
     * 提示普通消息
     */
    public static void notifyInfo(String content) {
        Notification notification = DEFAULT_GROUP.createNotification(content, NotificationType.INFORMATION);
        Notifications.Bus.notify(notification);
    }

    /**
     * 提示普通消息
     */
    public static void notifyInfo(String title, String content) {
        Notification notification = DEFAULT_GROUP
                .createNotification(content, NotificationType.INFORMATION);
        notification.setTitle(title);
//        notification.setListener(new UrlOpeningListener(false));
        Notifications.Bus.notify(notification);
    }

    /**
     * 提示警告消息
     */
    public static void notifyWarning(String content) {
        Notification notification = DEFAULT_GROUP.createNotification(content, NotificationType.WARNING);
        Notifications.Bus.notify(notification);
    }

    /**
     * 提示警告消息
     */
    public static void notifyWarning(String title, String content) {
        Notification notification = DEFAULT_GROUP.createNotification(content, NotificationType.WARNING);
        notification.setTitle(title);
        Notifications.Bus.notify(notification);
    }


    /**
     * 提示错误消息
     */
    public static void notifyError(String content) {
        Notification notification = DEFAULT_GROUP.createNotification(content, NotificationType.ERROR);
        Notifications.Bus.notify(notification);
    }

    /**
     * 提示错误消息
     */
    public static void notifyError(String title, String content) {
        Notification notification = DEFAULT_GROUP.createNotification(content, NotificationType.ERROR);
        notification.setTitle(title);
        Notifications.Bus.notify(notification);
    }

    /**
     * 通知
     */
    public static void notify(NotificationType type, String title, String content, AnAction... actions) {
        Notification notification = DEFAULT_GROUP
                .createNotification(content, type);
        notification.setTitle(title);
//        notification.setListener(new UrlOpeningListener(false));
        if (actions != null) {
            for (AnAction action : actions) {
                notification.addAction(action);
            }
        }
        Notifications.Bus.notify(notification);
    }
}
