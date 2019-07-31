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
        BuildJava buildEntity = new GeneratorEntity();
        buildEntity.generate();

        buildEntity = new GeneratorMapperXml();
        buildEntity.generate();

        buildEntity = new GeneratorMapperJava();
        buildEntity.generate();

        buildEntity = new GeneratorService();
        buildEntity.generate();

        buildEntity = new GeneratorServiceImpl();
        buildEntity.generate();

        buildEntity = new GeneratorController();
        buildEntity.generate();
    }

}
