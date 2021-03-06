package com.itwh.a0520erp.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 翁煌
 * @Description:
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataGridView {
	
	private Integer code=0;
	private String msg="";
	private Long count=0L;
	private Object data;
	public DataGridView(Long count, Object data) {
		super();
		this.count = count;
		this.data = data;
	}
	public DataGridView(Object data) {
		super();
		this.data = data;
	}
}
