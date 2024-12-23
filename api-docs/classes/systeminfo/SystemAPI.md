# SystemAPI

- **class** `SystemAPI` (`systeminfo\SystemAPI`)
- **package** `systeminfo`
- **source** `systeminfo/SystemAPI.php`

**Description**

Класс для получения системной информации

---

#### Static Methods

- `SystemAPI ::`[`getProcessorName()`](#method-getprocessorname) - _Получить название процессора_
- `SystemAPI ::`[`getPhysicalProcessorCount()`](#method-getphysicalprocessorcount) - _Получить количество физических ядер процессора_
- `SystemAPI ::`[`getLogicalProcessorCount()`](#method-getlogicalprocessorcount) - _Получить количество логических ядер процессора_
- `SystemAPI ::`[`getProcessorBaseFrequency()`](#method-getprocessorbasefrequency) - _Получить базовую частоту процессора_
- `SystemAPI ::`[`getProcessorMaxFrequency()`](#method-getprocessormaxfrequency) - _Получить максимальную частоту процессора_
- `SystemAPI ::`[`getProcessorVendor()`](#method-getprocessorvendor) - _Получить производителя процессора_
- `SystemAPI ::`[`getProcessorIdentifier()`](#method-getprocessoridentifier) - _Получить идентификатор процессора_
- `SystemAPI ::`[`getTotalMemory()`](#method-gettotalmemory) - _Получить общий объем памяти_
- `SystemAPI ::`[`getAvailableMemory()`](#method-getavailablememory) - _Получить доступный объем памяти_
- `SystemAPI ::`[`getGraphicsCardName()`](#method-getgraphicscardname) - _Получить название видеокарты_
- `SystemAPI ::`[`getNetworkInterfaces()`](#method-getnetworkinterfaces) - _Получить список сетевых интерфейсов_
- `SystemAPI ::`[`getUsbDevices()`](#method-getusbdevices) - _Получить список USB-устройств_
- `SystemAPI ::`[`getRunningProcesses()`](#method-getrunningprocesses) - _Получить список запущенных процессов_

---
# Static Methods

<a name="method-getprocessorname"></a>

### getProcessorName()
`php SystemAPI::getProcessorName(): string`
Получить название процессора

---

<a name="method-getphysicalprocessorcount"></a>

### getPhysicalProcessorCount()
`php SystemAPI::getPhysicalProcessorCount(): int`
Получить количество физических ядер процессора

---

<a name="method-getlogicalprocessorcount"></a>

### getLogicalProcessorCount()
`php SystemAPI::getLogicalProcessorCount(): int`
Получить количество логических ядер процессора

---

<a name="method-getprocessorbasefrequency"></a>

### getProcessorBaseFrequency()
`php SystemAPI::getProcessorBaseFrequency(): float`
Получить базовую частоту процессора

---

<a name="method-getprocessormaxfrequency"></a>

### getProcessorMaxFrequency()
`php SystemAPI::getProcessorMaxFrequency(): float`
Получить максимальную частоту процессора

---

<a name="method-getprocessorvendor"></a>

### getProcessorVendor()
`php SystemAPI::getProcessorVendor(): string`
Получить производителя процессора

---

<a name="method-getprocessoridentifier"></a>

### getProcessorIdentifier()
`php SystemAPI::getProcessorIdentifier(): string`
Получить идентификатор процессора

---

<a name="method-gettotalmemory"></a>

### getTotalMemory()
`php SystemAPI::getTotalMemory(): long`
Получить общий объем памяти

---

<a name="method-getavailablememory"></a>

### getAvailableMemory()
`php SystemAPI::getAvailableMemory(): long`
Получить доступный объем памяти

---

<a name="method-getgraphicscardname"></a>

### getGraphicsCardName()
`php SystemAPI::getGraphicsCardName(): string`
Получить название видеокарты

---

<a name="method-getnetworkinterfaces"></a>

### getNetworkInterfaces()
`php SystemAPI::getNetworkInterfaces(): string`
Получить список сетевых интерфейсов

---

<a name="method-getusbdevices"></a>

### getUsbDevices()
`php SystemAPI::getUsbDevices(): string`
Получить список USB-устройств

---

<a name="method-getrunningprocesses"></a>

### getRunningProcesses()
`php SystemAPI::getRunningProcesses(): string`
Получить список запущенных процессов
