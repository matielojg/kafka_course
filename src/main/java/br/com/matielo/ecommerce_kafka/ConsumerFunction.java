package br.com.matielo.ecommerce_kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface ConsumerFunction {
	void consume(ConsumerRecord<String, String> record);
}
