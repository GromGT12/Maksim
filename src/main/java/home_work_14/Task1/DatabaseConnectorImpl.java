package home_work_14.Task1;

import org.apache.commons.lang3.RandomUtils;

public class DatabaseConnectorImpl implements DatabaseConnector {

    @Override
    public byte[] connectToDatabase() throws DatabaseCheckedException {
        if (RandomUtils.nextBoolean()) {
            throw new DatabaseCheckedException("Пробуем подключиться к базе данных");
        }
        System.out.println("Получилось");
        return new byte[0];
    }
}
