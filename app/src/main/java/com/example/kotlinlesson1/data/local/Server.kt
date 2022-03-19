package com.example.kotlinlesson1.data.local

import com.example.kotlinlesson1.R
import com.example.kotlinlesson1.models.NameModel


object Server {
    fun getBooks(): ArrayList<NameModel> {
        val list = ArrayList<NameModel>()
        list.add(
            NameModel(
                "Madara",
                "Он один из основателей КОНОХИ. И первый человек пробудивший МАНГЕКО ШАРИНГАН. Человек чьи глаза приручили Девятихвостого. Не победимиый и бессмертный мой сообщник и учитель. Единственный кому удалось узнать последнюю тайну МАНГЕКО ШАРИНГАНА. ВОТ КТО ТАКОЙ УЧИХА МАДАРА",
                R.drawable.img
            )
        )
        list.add(
            NameModel(
                "Рик и Морти",
                "Rick and Morty, the unlikely pair at the heart of the hit Adult Swim cartoon, happily bring their signature blend of brainy sci-fi and surreal, warped mayhem to print. When dissolute genius Rick builds a device to predict the future of the stock market, he and his bumbling teenage grandson, Morty, hit the big time. But time cops catch on to their scheme, and they're sentenced to prison in a torturous labyrinth. That's a tidy metaphor for most Rick and Morty plots, since Rick has his fingers in just about every parallel universe, so moments of sentimentality can easily turn on a dime with an interdimensional leap (and a knowing wink ro the reader), hurtling hapless Morty in myriad disorienting directions. Though readers unfamiliar with the show might be thrown off by the idiosyncratic speech style, it's a pitch-perfect replica of the voice actors' performances, and the artwork, full of exaggerated cartoon shapes and grotesque creatures, expertly mimics the animation. With intelligent plots and lowbrow jokes aplenty, this is tailor-made for older teens",
                R.drawable.img_1)
        )
        list.add(
            NameModel(
                "Булгаков Мастер и Маргарита ",
                "Бессмертное, загадочное и остроумное «Евангелие от Сатаны» Михаила Булгакова.\n" +
                        "Роман, уникальный в российской литературе ХХ столетия. Трудно себе представить, какое влияние он оказал на мировую культуру.\n" +
                        "На основе «Мастера и Маргариты» снимались и продолжают сниматься фильмы и телесериалы, это произведение легло в основу оперы, симфонии, рок-оперы, его иллюстрировали самые знаменитые художники и фотографы.\n" +
                        "Достаточно перечислить лишь немногих создателей произведений, посвященных шедевру Булгакова и им вдохновленных: Анджей Вайда, Эннио Морриконе, Мик Джаггер, Дэвид Боуи.\n" +
                        "Чем же заворожила столь разных творческих личностей история о дьяволе и его свите, почтивших своим присутствием Москву 1930-х, о прокураторе Иудеи всаднике Понтии Пилате и нищем философе Иешуа Га-Ноцри, о талантливом и несчастном Мастере и его прекрасной и верной возлюбленной Маргарите?..\n" +
                        "Подробнее: https://www.labirint.ru/books/475815/",
                R.drawable.img_2
            )
        )
        return list

    }
}