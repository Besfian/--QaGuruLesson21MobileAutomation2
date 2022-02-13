# QaGuruLesson21MobileAutomation2
## Домашнее задание к уроку 21. Курс автоматизации тестирования qa.guru
1. Разработан автотест для проверки мобильного приложения Wikipedia
2. Запуск теста возможен на разных стендах: browserstack, selenoid, local (на эмуляторе мобильного устройства)
3. Реализована настройка параметров через соответствующие файлы конфигурации
- browserstack.properties
- selenoid.properties
- local.properties
#### Пример запуска из командной строки
```bash
gradle clean selenoid
```
