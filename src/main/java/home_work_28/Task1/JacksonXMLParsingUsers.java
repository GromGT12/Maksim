package home_work_28.Task1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class JacksonXMLParsingUsers {
    public static void main(String[] args) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        InputStream resources = ClassLoader.getSystemResourceAsStream("Task1/post.xml");
        List<PostUsersXml> postUsersXMLS = xmlMapper.readValue(resources, new TypeReference<>() {
        });
        PostUsersXml firstElement = postUsersXMLS.get(0);
        System.out.println(firstElement);


    }
}
