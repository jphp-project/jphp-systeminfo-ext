<?php
namespace systeminfo;

/**
 * Class DeviceAPI
 * @package systeminfo
 */
class DeviceAPI
{
    /**
     * --RU--
     * Получить имя устройства
     * --EN--
     * Get device name
     * @return string
     */
    public static function getDeviceName() {}

    /**
     * --RU--
     * Получить название операционной системы
     * --EN--
     * Get OS name
     * @return string
     */
    public static function getOsName() {}

    /**
     * --RU--
     * Получить версию операционной системы
     * --EN--
     * Get OS version
     * @return string
     */
    public static function getOsVersion() {}

    /**
     * --RU--
     * Получить имя пользователя
     * --EN--
     * Get user name
     * @return string
     */
    public static function getUserName() {}

    /**
     * --RU--
     * Получить MAC-адрес устройства
     * --EN--
     * Get MAC address
     * @return string
     */
    public static function getMacAddress() {}

    /**
     * --RU--
     * Получить IP-адрес устройства
     * --EN--
     * Get IP address
     * @return string
     */
    public static function getIpAddress() {}

    /**
     * --RU--
     * Получить список сетевых интерфейсов
     * --EN--
     * Get network interfaces
     * @return string
     */
    public static function getNetworkInterfaces() {}

    /**
     * --RU--
     * Получить время работы системы в секундах
     * --EN--
     * Get uptime
     * @return long
     */
    public static function getUptime() {}

    /**
     * --RU--
     * Получить архитектуру устройства
     * --EN--
     * Get architecture
     * @return string
     */
    public static function getArchitecture() {}
}
