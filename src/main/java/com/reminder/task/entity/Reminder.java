package com.reminder.task.entity;

import java.time.LocalDateTime;

public class Reminder {
    Integer id;
    String title;
    String description;
    LocalDateTime date;
    LocalDateTime time;
    LocalDateTime createDate;
    String status;
    String priority;
    Integer taskId;
    String userId;
    String notificationMethod;
}
