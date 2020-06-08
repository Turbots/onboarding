package com.vmware.tanzu.onboarding;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@TestPropertySource(properties = "management.metrics.export.wavefront.enabled=false")
@SpringBootTest
class OnboardingApplicationTests {

	@Test
	void contextLoads() {
	}

}
