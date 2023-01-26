package putriwahyuni.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import putriwahyuni.spring.core.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
    "putriwahyuni.spring.core.repository",
    "putriwahyuni.spring.core.service",
    "putriwahyuni.spring.core.configuration"
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
