package com.gcheliz.cucumber.stepdefs;

import com.gcheliz.BlogApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = BlogApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
