package com.itwh.a0520erp.vo;


import com.itwh.a0520erp.domain.Goods;
import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * @Author 翁煌
 * @Description:
 * @Version 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GoodsVo extends Goods {

	/*
	 *  
	 */
	private static final long serialVersionUID = 1L;

	private Integer page = 1;
	private Integer limit = 10;


}
