# Project For Enoca

## Project Structure 
![classes](https://github.com/Yusuf-Solmaz/ProjectForEnoca/assets/83172478/aeeb41a2-ad31-4b95-99be-5024d7deb49c)

  - ** Entity klasöründe Databasede olan sınıflarımız bulunur. Öğretmen ve öğrenci oneToMany ilişkisi içerisindedir. **
  - ** Repository kısmında JPA'ye bağlantı kuruldu. **
  - ** Service (Interface) kısmında gerekli olan methodlar yazıldı. Implementasyonları ServiceImp kısmında kuruldu. **
  - ** Controllerde requestler için gerekli olan methodlar oluşturuldu. ** 
  - ** Temel requestlere JPA Repository yardımıylşa ulaşabiliyoruz. Ben burada bir query ekledim. Bu query'nin amacı soy isme göre kullanıcı verisini getirmek. **

![getLastNameQuerry](https://github.com/Yusuf-Solmaz/ProjectForEnoca/assets/83172478/bd261445-8791-4a38-85b3-b1bd1c8ab698)

## UML Diagram

![DbDiagram](https://github.com/Yusuf-Solmaz/ProjectForEnoca/assets/83172478/10034e7a-5146-4e22-9038-3e93402e71c5)


## Requests

![saveStudent](https://github.com/Yusuf-Solmaz/ProjectForEnoca/assets/83172478/146e8683-5a60-4a41-bf65-f3a670a98afc)
![getStudents](https://github.com/Yusuf-Solmaz/ProjectForEnoca/assets/83172478/4462fcb1-b375-47a3-ba1d-aa220fe572d4)
![UpdateStudents](https://github.com/Yusuf-Solmaz/ProjectForEnoca/assets/83172478/f0fb3696-c053-4039-b4bb-7d2de1e7a7ad)
![deleteStudents](https://github.com/Yusuf-Solmaz/ProjectForEnoca/assets/83172478/050638f3-faf4-42c9-b4dd-c37c323ce7ed)
![getOneById](https://github.com/Yusuf-Solmaz/ProjectForEnoca/assets/83172478/3a3ab246-c982-4a8b-a1fa-e88d6fc6f152)
![getLastName](https://github.com/Yusuf-Solmaz/ProjectForEnoca/assets/83172478/907e807a-1e0b-424f-9feb-aa534bdaf849)
