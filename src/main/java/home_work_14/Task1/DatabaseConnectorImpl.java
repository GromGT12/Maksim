package home_work_14.Task1;

import org.apache.commons.lang3.RandomUtils;

public class DatabaseConnectorImpl implements DatabaseConnector {

    @Override
    public byte[] connectToDatabase() throws DatabaseCheckedException {
        if (RandomUtils.nextBoolean()) {
            // здесь поменяй текст на "Ошибка подключения к БД" , тк эксепшен кидается только тогда, когда мы попробовали и у нас не получилось)
            throw new DatabaseCheckedException("Пробуем подключиться к базе данных");
        }
        System.out.println("Получилось");
        return new byte[0];
    }
}
