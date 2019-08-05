package Generator;

import build.java.BuildJava;
import build.java.controller.GeneratorController;
import build.java.entity.GeneratorEntity;
import build.java.mapper.GeneratorMapperJava;
import build.java.mapper.GeneratorMapperXml;
import build.java.service.GeneratorService;
import build.java.service.GeneratorServiceImpl;

public class GenerateJava {

    public static void generator() {
        // 实体
        BuildJava buildEntity = new GeneratorEntity();
        buildEntity.generate();

        // mapper.xml
        buildEntity = new GeneratorMapperXml();
        buildEntity.generate();

        // mapper.java
        buildEntity = new GeneratorMapperJava();
        buildEntity.generate();

        // service
        buildEntity = new GeneratorService();
        buildEntity.generate();

        // serviceImpl
        buildEntity = new GeneratorServiceImpl();
        buildEntity.generate();

        // Controller
        buildEntity = new GeneratorController();
        buildEntity.generate();
    }

}
