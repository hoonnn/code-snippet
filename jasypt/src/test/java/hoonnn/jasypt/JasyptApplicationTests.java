package hoonnn.jasypt;

import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * https://github.com/ulisesbocchio/jasypt-spring-boot
 */
@Slf4j
//@RunWith(SpringRunner.class)
@SpringBootTest
public class JasyptApplicationTests {

	@Test
	public void encryptAndDecrypt() {
		String targetText = "password";

		StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
		standardPBEStringEncryptor.setPassword("abcd1234");
		standardPBEStringEncryptor.setAlgorithm("PBEWithMD5AndDES");
		standardPBEStringEncryptor.setStringOutputType("base64");

		String encryptedText = standardPBEStringEncryptor.encrypt(targetText);
		String decryptedText = standardPBEStringEncryptor.decrypt(encryptedText);

		log.info("targetText: {}, encryptedText: {}", targetText, encryptedText);

		Assert.assertEquals(targetText, decryptedText);

//		PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
//		SimpleStringPBEConfig config = new SimpleStringPBEConfig();
//		config.setPassword("password");
//		config.setAlgorithm("PBEWithMD5AndDES");
//		config.setKeyObtentionIterations("1000");
//		config.setPoolSize("1");
//		config.setProviderName("SunJCE");
//		config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
//		config.setIvGeneratorClassName("org.jasypt.salt.NoOpIVGenerator");
//		config.setStringOutputType("base64");
//		config.set
//		encryptor.setConfig(config);
	}



}
