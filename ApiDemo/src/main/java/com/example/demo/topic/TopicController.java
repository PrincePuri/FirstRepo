package com.example.demo.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class TopicController {

	@Autowired // this class has dependency to TopicService class and its gonna inject that
				// while creating object of TopicController
	private TopicService topicService;

	@RequestMapping("/topics")
	public Flux<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}

	@RequestMapping("/topics/{id}") // by writing id in braces, we tell java that this is a variable. id in
									// requestMapping is passed to pathVariable by mapping name of both variables
									// i.e id.
	public Mono<Topic> getTopic(@PathVariable("id") String idi) {
		return topicService.getTopic(idi);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topic)	{
		System.out.println(topic.getName());
		System.out.println("add topic controller");
		topicService.addTopic(topic);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public void updateTopic(@RequestBody Topic topic , @PathVariable String id) {
		topicService.updateTopic(topic,id);

	}

}