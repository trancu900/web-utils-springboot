package vn.rananu.shared.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public abstract class BaseController {
    @Autowired
    private MessageSource messageSource;
}
