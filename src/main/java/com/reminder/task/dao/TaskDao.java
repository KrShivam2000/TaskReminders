package com.reminder.task.dao;

import com.reminder.task.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskDao extends JpaRepository<Task,Integer> {

}
