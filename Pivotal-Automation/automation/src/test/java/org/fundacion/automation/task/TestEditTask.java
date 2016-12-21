package org.fundacion.automation.task;

import org.fundacion.automation.projects.Base;
import org.fundacion.pages.login.LoginPage;
import org.fundacion.pages.projects.CreateProjectPage;
import org.fundacion.pages.projects.ProjectMenuPage;
import org.fundacion.pages.projects.SettingsPage;
import org.fundacion.pages.stories.SideBarStoriesPage;
import org.fundacion.pages.stories.StoryPage;
import org.fundacion.pages.task.TaskPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Angelica Rodriguez on 12/19/2016.
 */
public class TestEditTask extends Base {
  ProjectMenuPage projectMenuPage;
  StoryPage storyPage;
  SettingsPage settingsPage;
  String title = "Test edit task";
  String testClass = "testEditTask";

  @BeforeMethod
  public void login() {
    driver.get(configurationObj.getProperty("url"));
    LoginPage login = new LoginPage(driver);
    login.setUserName(configurationObj.getProperty("userName"));
    login.clickContinue();
    login.setPassword(configurationObj.getProperty("userPassword"));
    home = login.clickSubmit();
  }

  @Test
  public void testEditTask() {
    log.info(testClass, title);
    CreateProjectPage project = home.clickCreateProject();
    project.setProjectName("TestStoryWithTask");
    project.clickNewAccount("Task");

    projectMenuPage = project.clickCreate();

    SideBarStoriesPage sideBarStories = projectMenuPage.sideBarStories();
    storyPage = sideBarStories.clickOnAddStoryButton();
    storyPage.setTitleStory("TestStory");

    TaskPage taskPage = storyPage.clickCreateTask(driver);
    taskPage.addTask("new task3");
    taskPage.addTask("new task4");
    taskPage.addTask("new task5");
    taskPage.addTask("new task6");
    taskPage.addTask("new task7");
    taskPage.editTask("new task4");
    taskPage.inputNewName("new task8");
    storyPage.clickOnCreateStory();
    storyPage.clickOnExpandStory();
    assertEquals(1, taskPage.sizeContentNameTask("new task8"));
    log.info(testClass, "Verify that the task is edited correctly");
  }

  @AfterMethod
  public void clean() {
    storyPage.clickDeleteStory();
    settingsPage = projectMenuPage.clickSettings();
    settingsPage.deleteProject();
  }
}
