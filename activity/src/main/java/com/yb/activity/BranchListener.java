package com.yb.activity;

import java.util.Map;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class BranchListener implements ExecutionListener {

	/**
	 * <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;

	public void notify(DelegateExecution execution) throws Exception {
		Map<String, Object> variables = execution.getVariables();
		System.out.println("分支参数：");
		for (String key : variables.keySet()) {
			System.out.println("key:" + key + ", value:" + variables.get(key));
		}
	}

}
