package build.java.controller;

import build.java.BuildJava;
import build.java.BuildJavaAbstract;
import common.Util;

public class GeneratorController extends BuildJavaAbstract implements BuildJava {

    public GeneratorController() {
        templateName = "controller.ftl";
    }

    @Override
    public void generateDataList() {
        dataMap.put("package", propMap.get("package_controller"));
        dataMap.put("entityClass", propMap.get("package_entity") + "." + Util.DBNameToJavaName(propMap.get("tableName")));
        dataMap.put("entityName", Util.DBNameToJavaName(propMap.get("tableName")));
        dataMap.put("controllerName", Util.DBNameToJavaName(propMap.get("tableName"))+"Controller");

        dataMap.put("requestUrl", propMap.get("tableName").toLowerCase().replaceAll("_", "-"));

        // 生成目录
        folder = Util.packToFolder(propMap.get("package_controller"));
        // 生成文件
        generateFileName = Util.DBNameToJavaName(propMap.get("tableName")) + "Controller.java";
    }
}
