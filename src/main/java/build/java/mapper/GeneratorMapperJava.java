package build.java.mapper;

import build.java.BuildJava;
import build.java.BuildJavaAbstract;
import common.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratorMapperJava extends BuildJavaAbstract implements BuildJava {

    public GeneratorMapperJava() {
        templateName = "mapperJava.ftl";
    }

    @Override
    public void generateDataList() {
        dataMap.put("package", propMap.get("package_mapper"));
        dataMap.put("entityClass", propMap.get("package_entity") + "." + Util.DBNameToJavaName(propMap.get("tableName")));
        dataMap.put("entityName", Util.DBNameToJavaName(propMap.get("tableName")));
        dataMap.put("mapperName", Util.DBNameToJavaName(propMap.get("tableName"))+"Mapper");

        // 生成目录
        folder = Util.packToFolder(propMap.get("package_mapper"));
        // 生成文件
        generateFileName = Util.DBNameToJavaName(propMap.get("tableName")) + "Mapper.java";
    }
}
