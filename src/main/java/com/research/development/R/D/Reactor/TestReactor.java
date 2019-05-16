package com.research.development.R.D.Reactor;

import java.util.Scanner;

import reactor.core.publisher.Flux;

public class TestReactor {
	public static void main(String[] args) {
		Flux<String> flux = Flux.create(emitter -> {
			new Thread(()->{
			try {
				emitter.next("Sid");
				Thread.sleep(3000);
				emitter.next("Majid");
				Thread.sleep(3000);
				emitter.next("Amir");
				Thread.sleep(1000);
				emitter.complete();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}).start();
		});

		flux
		.doOnComplete(() -> System.out.println("Flux is ended"))
		.subscribe(str -> System.out.println("Got: " + str));
		System.out.println("Last Line");
		}	
	
	public static Flux<String> getStudent(){
		Flux<String> flux = Flux.create(emitter -> {
			new Thread(()->{
			try {
				emitter.next("Sid");
				Thread.sleep(6000);
				emitter.next("Majid");
				Thread.sleep(6000);
				emitter.next("Amir");
				Thread.sleep(6000);
				emitter.next("Rishabaha");
				emitter.complete();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}).start();
		});
		System.out.println("Last Line");
		return flux;
	}
}
