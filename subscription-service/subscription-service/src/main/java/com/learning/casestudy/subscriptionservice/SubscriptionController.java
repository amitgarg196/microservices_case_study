package com.learning.casestudy.subscriptionservice;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriptionController {

	Logger logger = LoggerFactory.getLogger(SubscriptionController.class);
	
	@Autowired
	SubscriptionService subscriptionService;
	
	@GetMapping("/subscriptions")
	public List<Subscription> retrieveSubscriptions() {

		return subscriptionService.retrieveSubscriptions();
	}

	@PostMapping("/subscriptions")
	public ResponseEntity<HttpStatus> createSubscription(@RequestBody Subscription subscription) {

		logger.debug("@@@@@@@ Received: - " + subscription.getBookId() + " " + subscription.getSubscriberName() + " "
				+ subscription.getDateSubscribed() + " " + subscription.getDateReturned());

		return ResponseEntity.created(null).body(subscriptionService.createSubscription(subscription));
	}
}
