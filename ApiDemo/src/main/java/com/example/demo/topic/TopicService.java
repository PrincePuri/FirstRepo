package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service // this annotation marks this class as spring service.
public class TopicService {

	List<Topic> topics;

	public TopicService() {

		topics = new ArrayList<Topic>();

		topics.add(new Topic("Spring", "Spring", "Spring"));
		topics.add(new Topic("Spring2", "Spring2", "Spring2"));
		topics.add(new Topic("Spring3", "Spring3", "Spring3"));
		topics.add(new Topic("Spring4", "Spring4", "Spring4"));

	}

	public Flux<Topic> getAllTopics() {
		
		return Flux.just(new Topic("Spring", "Spring", "Spring"), new Topic("Spring2", "Spring2", "Spring2"));
	}

	public Mono<Topic> getTopic(String id) {

		return Mono.just(new Topic("Spring", "Spring", "Spring"));
	}

	public void addTopic(Topic topic) {

		// List<Topic> t=new ArrayList<>();
		System.out.println("add topic service");
		topics.add(topic);

	}

	public void updateTopic(Topic topic, String id) {
		int i;
		for (i = 0; i < topics.size(); i++) {
			Topic t = topics.get(i);

			if (t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

}
