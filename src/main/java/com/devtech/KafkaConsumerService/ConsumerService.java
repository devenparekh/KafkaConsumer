package com.devtech.KafkaConsumerService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

	Logger log = LoggerFactory.getLogger(ConsumerService.class);
	
	@KafkaListener(topics = "devTopic-2", groupId = "dt-1")
	public void consumeMessage(String message) {
		//log.info("Consumer consumed the following message : {}", message);
	System.out.println("Consumer consumed the following message : " + message);
	}
	
}
