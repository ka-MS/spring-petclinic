package org.springframework.samples.petclinic.sample;

public class SampleController {
	SampleRepository sampleRepository;

	public SampleController(){
		this.sampleRepository = sampleRepository;
	}

	public void doSomething(){
		sampleRepository.save();
	}


}
