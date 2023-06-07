package ru.smartcampus.smartcampus.interfaces;

/**
 * Интерфейс сервиса взаимодействия с питоновским модулем
 */
public interface ModelService {

    /**
     * Запускает обучение модели
     */
    void study();

    /**
     * Получает ответ на запрос пользователя
     *
     * @param question текст запроса пользователя
     */
    String getAnswer(String question);
}
