package com.cranajit.music.daos;

import org.springframework.data.repository.CrudRepository;

import com.cranajit.music.models.TopicModel;

public interface TopicReposetory extends CrudRepository<TopicModel, String>{
}
