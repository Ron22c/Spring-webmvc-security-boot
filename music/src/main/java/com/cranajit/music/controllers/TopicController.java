package com.cranajit.music.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cranajit.music.models.TopicModel;
import com.cranajit.music.services.TopicService;

@Controller
public class TopicController {
	
	@Autowired
	private TopicService topicService;

	@ResponseBody
	@RequestMapping("/topics")
	public List<TopicModel> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@ResponseBody
	@RequestMapping("/topic/{id}")
	public TopicModel getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@ResponseBody
	@RequestMapping(value = "/topic", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addTopic(@RequestBody TopicModel topic) {
		topicService.addTopic(topic);
	}
	
	@ResponseBody
	@RequestMapping(value = "/topic/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateTopic(@RequestBody TopicModel topic, @PathVariable("id") String id) {
		topicService.updateTopic(id, topic);
	}
	
	@ResponseBody
	@RequestMapping(value = "/topic/{id}", method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
