package com.ant.test;

import org.apache.tools.ant.Project;
 
 
public class AttrHelloWorld  {
               
                private Project project;
               
               
                public void setProject(Project proj) {
        project = proj;
    }
 
    public void execute() {
        String message = project.getProperty("ant.project.name");
        project.log("Here is project '" + message + "'.", Project.MSG_INFO);
       
        //log("I am used in: " +  getLocation() );
       
    }
 
}