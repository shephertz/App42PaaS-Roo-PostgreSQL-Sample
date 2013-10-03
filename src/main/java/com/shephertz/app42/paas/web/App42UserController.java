package com.shephertz.app42.paas.web;

import com.shephertz.app42.paas.App42User;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/app42users")
@Controller
@RooWebScaffold(path = "app42users", formBackingObject = App42User.class)
public class App42UserController {
}
