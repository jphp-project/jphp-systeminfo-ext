<?php
namespace systeminfo;

/**
 * Class SystemAPI
 * @package systeminfo
 */
class SystemAPI
{
    /**
     * --RU--
     * Получить название процессора
     * --EN--
     * Get processor name
     * @return string
     */
    public static function getProcessorName() {}

    /**
     * --RU--
     * Получить количество физических ядер процессора
     * --EN--
     * Get physical processor count
     * @return int
     */
    public static function getPhysicalProcessorCount() {}

    /**
     * --RU--
     * Получить количество логических ядер процессора
     * --EN--
     * Get logical processor count
     * @return int
     */
    public static function getLogicalProcessorCount() {}

    /**
     * --RU--
     * Получить базовую частоту процессора в ГГц
     * --EN--
     * Get processor base frequency
     * @return float
     */
    public static function getProcessorBaseFrequency() {}

    /**
     * --RU--
     * Получить максимальную (турбо) частоту процессора в ГГц
     * --EN--
     * Get processor max frequency
     * @return float
     */
    public static function getProcessorMaxFrequency() {}

    /**
     * --RU--
     * Получить производителя процессора
     * --EN--
     * Get processor vendor
     * @return string
     */
    public static function getProcessorVendor() {}

    /**
     * --RU--
     * Получить идентификатор процессора
     * --EN--
     * Get processor identifier
     * @return string
     */
    public static function getProcessorIdentifier() {}

    /**
     * --RU--
     * Получить общий объем памяти в байтах
     * --EN--
     * Get total memory
     * @return long
     */
    public static function getTotalMemory() {}

    /**
     * --RU--
     * Получить доступный объем памяти в байтах
     * --EN--
     * Get available memory
     * @return long
     */
    public static function getAvailableMemory() {}

    /**
     * --RU--
     * Получить название видеокарты
     * --EN--
     * Get graphics card name
     * @return string
     */
    public static function getGraphicsCardName() {}

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
     * Получить список USB-устройств
     * --EN--
     * Get USB devices
     * @return string
     */
    public static function getUsbDevices() {}

    /**
     * --RU--
     * Получить список запущенных процессов
     * --EN--
     * Get running processes
     * @return string
     */
    public static function getRunningProcesses() {}
}
