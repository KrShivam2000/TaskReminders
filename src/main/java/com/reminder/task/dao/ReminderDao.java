package com.reminder.task.dao;

import com.reminder.task.entity.Reminder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReminderDao extends JpaRepository<Reminder,Integer> {

}
