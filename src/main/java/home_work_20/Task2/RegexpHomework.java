package home_work_20.Task2;


import home_work_20.Task1.AccountInfo;

import java.time.LocalDate;
import java.util.List;

/*
ВАЛИДАЦИЯ
Это процесс проверки данных, введенных пользователем, на соответствие заданным критериям (например, на отсутствие ошибок в данных).
Провалидируйте данные акаунтов, выведите в консоль, валиден ли аккаунт или нет. Если невалиден - выведите невалидное поле
Правила - имя и фамилия должны содержать только буквы
Телефон - должен содержать только цифры
email - должен быть валидным адресом, правило для валидации найдите в сети или в коде с занятия
 */
    public class RegexpHomework {
        public static void main(String[] args) {
            List<AccountInfo> accountInfos = List.of(
                    new AccountInfo("Ivan", "Ivanov", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11)),
                    new AccountInfo("Fedor", "Ivanov", "607499636", "ivan@tu.by", LocalDate.of(1990, 10, 11)),
                    new AccountInfo("Anna", "Ivanova", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 15)),
                    new AccountInfo("Egor", "Egorov", "607499636tr", "ivan@tu.by", LocalDate.of(1989, 2, 3)),
                    new AccountInfo("Andy23", "Aity", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11)),
                    new AccountInfo("Pavel", "Pavlov23", "607499636", "ivan@tu.by", LocalDate.of(2000, 10, 11)));

        }
    }

