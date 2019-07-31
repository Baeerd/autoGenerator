package com.sgai.pro.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgai.core.base.controller.BaseController;
import com.sgai.pro.entity.MesDeleteLoadingHis;

@RestController
@Scope("prototype")
@RequestMapping("/pro/mes-delete-loading-his")
public class MesDeleteLoadingHisController extends BaseController<MesDeleteLoadingHis> {

}
