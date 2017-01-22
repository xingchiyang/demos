package com.yb.activity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Main {
	@Autowired
	private RepositoryService repositoryService;
	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	private TaskService taskService;
	private static String KEY_MAIN = "main";
	private static String KEY_BRANCH = "branch";

	@PostConstruct
	public void init() {
		System.out.println("test");
	}

	public void executeSimple() {
		begin(KEY_MAIN);
	}

	public void executeBranch() {
		begin(KEY_BRANCH);
	}

	private String begin(String key) {
		repositoryService.createDeployment().addClasspathResource("conf/" + key + ".bpmn").deploy();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("flag", true);
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(key, map);
		return processInstance.getId();
	}

	private void complete(String processInstanceId) {
		List<Task> taskList;
		while ((taskList = taskService.createTaskQuery().processInstanceId(processInstanceId).list()).size() > 0) {
			System.out.println("待完成任务列表：");
			for (Task task : taskList) {
				System.out.println(task.getName());
			}
			System.out.println("\n完成任务：");
			for (Task task : taskList) {
				System.out.println(task.getName());
				taskService.complete(task.getId());
			}
		}
	}

}
