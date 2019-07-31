package build.java.entity;

import build.java.BuildJava;
import build.java.BuildJavaAbstract;
import common.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratorEntity extends BuildJavaAbstract implements BuildJava {

    public GeneratorEntity () {
        templateName = "entity.ftl";
    }

    @Override
    public void generateDataList() {
        dataMap.put("package", propMap.get("package_entity"));
        dataMap.put("class", Util.DBNameToJavaName(propMap.get("tableName")));

        Integer num = propMap.get("entityField")!=null?Integer.valueOf(propMap.get("entityField")):0;

        List<Map<String, String>> properlist = new ArrayList<>();
        int i = 0;
        for (Map<String, String> dbaDataMap : dbaList) {
            if(i++<num) {
                continue;
            }
            Map<String, String> map = new HashMap<>();
            map.put("fieldName", Util.fieldName(dbaDataMap.get("name")));
            map.put("fieldType", Util.DBTypeToJavaType(dbaDataMap.get("type")));
            map.put("fieldNameUpper", Util.fieldNameUpper(dbaDataMap.get("name")));
            properlist.add(map);
        }

        dataMap.put("properlist",properlist);
        // 生成目录
        folder = Util.packToFolder(propMap.get("package_entity"));
        // 生成文件
        generateFileName = Util.DBNameToJavaName(propMap.get("tableName")) + ".java";

    }

}
