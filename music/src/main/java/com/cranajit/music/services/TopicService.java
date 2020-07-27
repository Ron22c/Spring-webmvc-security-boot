package com.cranajit.music.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cranajit.music.daos.TopicReposetory;
import com.cranajit.music.models.TopicModel;

@Service
public class TopicService {
	
	@Autowired
	private TopicReposetory topicReposetory;

	private List<TopicModel> topics = new ArrayList<TopicModel>(Arrays.asList(new TopicModel("spring", "spring framework", "spring framework description"),
			new TopicModel("spring boot", "spring boot framework", "spring boot framework description"),
			new TopicModel("servlet", "servlet framework", "servlet framework description")));
	
	public List<TopicModel> getAllTopics() {
		//return topics;
		List<TopicModel> topics = new ArrayList<TopicModel>();
		topicReposetory.findAll().forEach(topics::add);
		return topics;
	}
	
	public TopicModel getTopic(String id) {
		//return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
		 
		Optional<TopicModel> topic = topicReposetory.findById(id);
		if(topic.isPresent()) {
			return topic.get();
		}
		return null;
	}
	
	public void addTopic(TopicModel topic) {
		//topics.add(topic);
		topicReposetory.save(topic);
	}
	
	public void updateTopic(String id, TopicModel topic) {
//		for(TopicModel t: topics) {
//			if(t.getId().equals(id)) {
//				t.setDescription(topic.getDescription());
//				t.setName(topic.getName());
//			}
//		}
		topicReposetory.save(topic);
	}
	
	public void deleteTopic(String id) {
		//topics.removeIf(topic -> topic.getId().equals(id));
		topicReposetory.deleteById(id);
	}
}
