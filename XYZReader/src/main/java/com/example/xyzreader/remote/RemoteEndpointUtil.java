package com.example.xyzreader.remote;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONTokener;

import java.io.IOException;
import java.net.URL;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class RemoteEndpointUtil {
    private static final String TAG = "RemoteEndpointUtil";
    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");

    private RemoteEndpointUtil() {
    }

    public static JSONArray fetchJsonArray() {
        String itemsJson = null;
        try {
            itemsJson = fetchPlainText(Config.BASE_URL);
        } catch (Exception e) {
            Log.e(TAG, "Error fetching items JSON es aqui el errors //"+itemsJson, e);
            return null;
        }

        // Parse JSON
        try {
            JSONTokener tokener = new JSONTokener(itemsJson);
            Object val = tokener.nextValue();
            if (!(val instanceof JSONArray)) {
                throw new JSONException("Expected JSONArray");
            }
            return (JSONArray) val;
        } catch (JSONException e) {
            Log.e(TAG, "Error parsing items JSON", e);
        }

        return null;
    }

    static String fetchPlainText(URL url) {
        String retorna="";
        OkHttpClient okHttpClient=null;
        try {
            /*okHttpClient= new OkHttpClient();
            Request request = new Request.Builder()
                    .header("Authorization", "your token")
                    .url(url)
                    .build();
            Log.e(TAG, "request"+request);
            Response response = okHttpClient.newCall(request).execute();
           retorna= response.body().string();*/
            retorna ="[\n" +
                    "  {\n" +
                    "    \"id\": \"4\",\n" +
                    "    \"photo\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/images/p004.jpg\",\n" +
                    "    \"thumb\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/thumbs/p004.jpg\",\n" +
                    "    \"aspect_ratio\": 1.49925,\n" +
                    "    \"author\": \"Carl Sagan\",\n" +
                    "    \"title\": \"Mysteries of the Universe Solved\",\n" +
                    "    \"published_date\": \"2013-06-20T00:00:00.000Z\",\n" +
                    "    \"body\": \"Paroxysm of global economics <a href='http://www.google.com'>Google Search</a> event take root and flourish, realm of the galaxies take root and flourish light years, circumnavigated Tunguska event Vangelis. Realm of the galaxies as a patch of light extraplanetary?<br><br>The carbon in our apple pies hundreds of thousands of brilliant syntheses cosmic ocean Hypatia explorations across the centuries take root and flourish muse about with pretty stories for which there's little good evidence. Tunguska event birth billions upon billions venture tesseract billions upon billions! Muse about dream of the mind's eye! Radio telescope. The only home we've ever known with pretty stories for which there's little good evidence! Hydrogen atoms cosmic fugue brain is the seed of intelligence the only home we've ever known? Inconspicuous motes of rock and gas of brilliant syntheses.<br><br>Network of wormholes across the centuries Jean-Fran�ois Champollion hearts of the stars? Vastness is bearable only through love, a still more glorious dawn awaits worldlets the carbon in our apple pies worldlets citizens of distant epochs corpus callosum quasar ship of the imagination. Colonies something incredible is waiting to be known from which we spring billions upon billions, paroxysm of global death with pretty stories for which there's little good evidence, intelligent beings astonishment.<br><br>Brain is the seed of intelligence, billions upon billions, corpus callosum trillion stirred by starlight consciousness cosmic fugue dispassionate extraterrestrial observer.<br><br>Bits of moving fluff. Muse about Apollonius of Perga worldlets the only home we've ever known dispassionate extraterrestrial observer with pretty stories for which there's little good evidence venture at the edge of forever, laws of physics muse about.<br><br>Photos courtesy of <a href='https://unsplash.com/'>Unsplash.com</a>.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"id\": \"2\",\n" +
                    "    \"photo\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/images/p002.jpg\",\n" +
                    "    \"thumb\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/thumbs/p002.jpg\",\n" +
                    "    \"aspect_ratio\": 1.49925,\n" +
                    "    \"author\": \"Edgar Allen Poe\",\n" +
                    "    \"title\": \"A Flatiron State of Mind\",\n" +
                    "    \"published_date\": \"2013-01-19T00:00:00.000Z\",\n" +
                    "    \"body\": \"Paroxysm of global economics <a href='http://www.google.com'>Google Search</a> event take root and flourish, realm of the galaxies take root and flourish light years, circumnavigated Tunguska event Vangelis. Realm of the galaxies as a patch of light extraplanetary?<br><br>The carbon in our apple pies hundreds of thousands of brilliant syntheses cosmic ocean Hypatia explorations across the centuries take root and flourish muse about with pretty stories for which there's little good evidence. Tunguska event birth billions upon billions venture tesseract billions upon billions! Muse about dream of the mind's eye! Radio telescope. The only home we've ever known with pretty stories for which there's little good evidence! Hydrogen atoms cosmic fugue brain is the seed of intelligence the only home we've ever known? Inconspicuous motes of rock and gas of brilliant syntheses.<br><br>Network of wormholes across the centuries Jean-Fran�ois Champollion hearts of the stars? Vastness is bearable only through love, a still more glorious dawn awaits worldlets the carbon in our apple pies worldlets citizens of distant epochs corpus callosum quasar ship of the imagination. Colonies something incredible is waiting to be known from which we spring billions upon billions, paroxysm of global death with pretty stories for which there's little good evidence, intelligent beings astonishment.<br><br>Brain is the seed of intelligence, billions upon billions, corpus callosum trillion stirred by starlight consciousness cosmic fugue dispassionate extraterrestrial observer.<br><br>Bits of moving fluff. Muse about Apollonius of Perga worldlets the only home we've ever known dispassionate extraterrestrial observer with pretty stories for which there's little good evidence venture at the edge of forever, laws of physics muse about.<br><br>Photos courtesy of <a href='https://unsplash.com/'>Unsplash.com</a>.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"id\": \"11\",\n" +
                    "    \"photo\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/images/p011.jpg\",\n" +
                    "    \"thumb\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/thumbs/p011.jpg\",\n" +
                    "    \"aspect_ratio\": 0.66667,\n" +
                    "    \"author\": \"Ernest Hemingway\",\n" +
                    "    \"title\": \"An Empire State of Mind\",\n" +
                    "    \"published_date\": \"2013-06-19T00:00:00.000Z\",\n" +
                    "    \"body\": \"Paroxysm of global economics <a href='http://www.google.com'>Google Search</a> event take root and flourish, realm of the galaxies take root and flourish light years, circumnavigated Tunguska event Vangelis. Realm of the galaxies as a patch of light extraplanetary?<br><br>The carbon in our apple pies hundreds of thousands of brilliant syntheses cosmic ocean Hypatia explorations across the centuries take root and flourish muse about with pretty stories for which there's little good evidence. Tunguska event birth billions upon billions venture tesseract billions upon billions! Muse about dream of the mind's eye! Radio telescope. The only home we've ever known with pretty stories for which there's little good evidence! Hydrogen atoms cosmic fugue brain is the seed of intelligence the only home we've ever known? Inconspicuous motes of rock and gas of brilliant syntheses.<br><br>Network of wormholes across the centuries Jean-Fran�ois Champollion hearts of the stars? Vastness is bearable only through love, a still more glorious dawn awaits worldlets the carbon in our apple pies worldlets citizens of distant epochs corpus callosum quasar ship of the imagination. Colonies something incredible is waiting to be known from which we spring billions upon billions, paroxysm of global death with pretty stories for which there's little good evidence, intelligent beings astonishment.<br><br>Brain is the seed of intelligence, billions upon billions, corpus callosum trillion stirred by starlight consciousness cosmic fugue dispassionate extraterrestrial observer.<br><br>Bits of moving fluff. Muse about Apollonius of Perga worldlets the only home we've ever known dispassionate extraterrestrial observer with pretty stories for which there's little good evidence venture at the edge of forever, laws of physics muse about.<br><br>Photos courtesy of <a href='https://unsplash.com/'>Unsplash.com</a>.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"id\": \"3\",\n" +
                    "    \"photo\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/images/p003.jpg\",\n" +
                    "    \"thumb\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/thumbs/p003.jpg\",\n" +
                    "    \"aspect_ratio\": 1.49925,\n" +
                    "    \"author\": \"Vincent Van Gogh\",\n" +
                    "    \"title\": \"10 Tips for Hipster Tea Parties\",\n" +
                    "    \"published_date\": \"2013-05-10T00:00:00.000Z\",\n" +
                    "    \"body\": \"Paroxysm of global economics <a href='http://www.google.com'>Google Search</a> event take root and flourish, realm of the galaxies take root and flourish light years, circumnavigated Tunguska event Vangelis. Realm of the galaxies as a patch of light extraplanetary?<br><br>The carbon in our apple pies hundreds of thousands of brilliant syntheses cosmic ocean Hypatia explorations across the centuries take root and flourish muse about with pretty stories for which there's little good evidence. Tunguska event birth billions upon billions venture tesseract billions upon billions! Muse about dream of the mind's eye! Radio telescope. The only home we've ever known with pretty stories for which there's little good evidence! Hydrogen atoms cosmic fugue brain is the seed of intelligence the only home we've ever known? Inconspicuous motes of rock and gas of brilliant syntheses.<br><br>Network of wormholes across the centuries Jean-Fran�ois Champollion hearts of the stars? Vastness is bearable only through love, a still more glorious dawn awaits worldlets the carbon in our apple pies worldlets citizens of distant epochs corpus callosum quasar ship of the imagination. Colonies something incredible is waiting to be known from which we spring billions upon billions, paroxysm of global death with pretty stories for which there's little good evidence, intelligent beings astonishment.<br><br>Brain is the seed of intelligence, billions upon billions, corpus callosum trillion stirred by starlight consciousness cosmic fugue dispassionate extraterrestrial observer.<br><br>Bits of moving fluff. Muse about Apollonius of Perga worldlets the only home we've ever known dispassionate extraterrestrial observer with pretty stories for which there's little good evidence venture at the edge of forever, laws of physics muse about.<br><br>Photos courtesy of <a href='https://unsplash.com/'>Unsplash.com</a>.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"id\": \"1\",\n" +
                    "    \"photo\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/images/p001.jpg\",\n" +
                    "    \"thumb\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/thumbs/p001.jpg\",\n" +
                    "    \"aspect_ratio\": 1.50376,\n" +
                    "    \"author\": \"Tom Brokaw\",\n" +
                    "    \"title\": \"My Story of Climbing a Mountain\",\n" +
                    "    \"published_date\": \"2013-05-02T00:00:00.000Z\",\n" +
                    "    \"body\": \"Paroxysm of global economics <a href='http://www.google.com'>Google Search</a> event take root and flourish, realm of the galaxies take root and flourish light years, circumnavigated Tunguska event Vangelis. Realm of the galaxies as a patch of light extraplanetary?<br><br>The carbon in our apple pies hundreds of thousands of brilliant syntheses cosmic ocean Hypatia explorations across the centuries take root and flourish muse about with pretty stories for which there's little good evidence. Tunguska event birth billions upon billions venture tesseract billions upon billions! Muse about dream of the mind's eye! Radio telescope. The only home we've ever known with pretty stories for which there's little good evidence! Hydrogen atoms cosmic fugue brain is the seed of intelligence the only home we've ever known? Inconspicuous motes of rock and gas of brilliant syntheses.<br><br>Network of wormholes across the centuries Jean-Fran�ois Champollion hearts of the stars? Vastness is bearable only through love, a still more glorious dawn awaits worldlets the carbon in our apple pies worldlets citizens of distant epochs corpus callosum quasar ship of the imagination. Colonies something incredible is waiting to be known from which we spring billions upon billions, paroxysm of global death with pretty stories for which there's little good evidence, intelligent beings astonishment.<br><br>Brain is the seed of intelligence, billions upon billions, corpus callosum trillion stirred by starlight consciousness cosmic fugue dispassionate extraterrestrial observer.<br><br>Bits of moving fluff. Muse about Apollonius of Perga worldlets the only home we've ever known dispassionate extraterrestrial observer with pretty stories for which there's little good evidence venture at the edge of forever, laws of physics muse about.<br><br>Photos courtesy of <a href='https://unsplash.com/'>Unsplash.com</a>.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"id\": \"5\",\n" +
                    "    \"photo\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/images/p005.jpg\",\n" +
                    "    \"thumb\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/thumbs/p005.jpg\",\n" +
                    "    \"aspect_ratio\": 1.49925,\n" +
                    "    \"author\": \"Thomas Edison\",\n" +
                    "    \"title\": \"How Fido Got His Bone Back\",\n" +
                    "    \"published_date\": \"2013-03-19T00:00:00.000Z\",\n" +
                    "    \"body\": \"Paroxysm of global economics <a href='http://www.google.com'>Google Search</a> event take root and flourish, realm of the galaxies take root and flourish light years, circumnavigated Tunguska event Vangelis. Realm of the galaxies as a patch of light extraplanetary?<br><br>The carbon in our apple pies hundreds of thousands of brilliant syntheses cosmic ocean Hypatia explorations across the centuries take root and flourish muse about with pretty stories for which there's little good evidence. Tunguska event birth billions upon billions venture tesseract billions upon billions! Muse about dream of the mind's eye! Radio telescope. The only home we've ever known with pretty stories for which there's little good evidence! Hydrogen atoms cosmic fugue brain is the seed of intelligence the only home we've ever known? Inconspicuous motes of rock and gas of brilliant syntheses.<br><br>Network of wormholes across the centuries Jean-Fran�ois Champollion hearts of the stars? Vastness is bearable only through love, a still more glorious dawn awaits worldlets the carbon in our apple pies worldlets citizens of distant epochs corpus callosum quasar ship of the imagination. Colonies something incredible is waiting to be known from which we spring billions upon billions, paroxysm of global death with pretty stories for which there's little good evidence, intelligent beings astonishment.<br><br>Brain is the seed of intelligence, billions upon billions, corpus callosum trillion stirred by starlight consciousness cosmic fugue dispassionate extraterrestrial observer.<br><br>Bits of moving fluff. Muse about Apollonius of Perga worldlets the only home we've ever known dispassionate extraterrestrial observer with pretty stories for which there's little good evidence venture at the edge of forever, laws of physics muse about.<br><br>Photos courtesy of <a href='https://unsplash.com/'>Unsplash.com</a>.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"id\": \"7\",\n" +
                    "    \"photo\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/images/p007.jpg\",\n" +
                    "    \"thumb\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/thumbs/p007.jpg\",\n" +
                    "    \"aspect_ratio\": 1.49925,\n" +
                    "    \"author\": \"Plato\",\n" +
                    "    \"title\": \"Why I Love Yellow\",\n" +
                    "    \"published_date\": \"2013-01-16T00:00:00.000Z\",\n" +
                    "    \"body\": \"Paroxysm of global economics <a href='http://www.google.com'>Google Search</a> event take root and flourish, realm of the galaxies take root and flourish light years, circumnavigated Tunguska event Vangelis. Realm of the galaxies as a patch of light extraplanetary?<br><br>The carbon in our apple pies hundreds of thousands of brilliant syntheses cosmic ocean Hypatia explorations across the centuries take root and flourish muse about with pretty stories for which there's little good evidence. Tunguska event birth billions upon billions venture tesseract billions upon billions! Muse about dream of the mind's eye! Radio telescope. The only home we've ever known with pretty stories for which there's little good evidence! Hydrogen atoms cosmic fugue brain is the seed of intelligence the only home we've ever known? Inconspicuous motes of rock and gas of brilliant syntheses.<br><br>Network of wormholes across the centuries Jean-Fran�ois Champollion hearts of the stars? Vastness is bearable only through love, a still more glorious dawn awaits worldlets the carbon in our apple pies worldlets citizens of distant epochs corpus callosum quasar ship of the imagination. Colonies something incredible is waiting to be known from which we spring billions upon billions, paroxysm of global death with pretty stories for which there's little good evidence, intelligent beings astonishment.<br><br>Brain is the seed of intelligence, billions upon billions, corpus callosum trillion stirred by starlight consciousness cosmic fugue dispassionate extraterrestrial observer.<br><br>Bits of moving fluff. Muse about Apollonius of Perga worldlets the only home we've ever known dispassionate extraterrestrial observer with pretty stories for which there's little good evidence venture at the edge of forever, laws of physics muse about.<br><br>Photos courtesy of <a href='https://unsplash.com/'>Unsplash.com</a>.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"id\": \"8\",\n" +
                    "    \"photo\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/images/p008.jpg\",\n" +
                    "    \"thumb\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/thumbs/p008.jpg\",\n" +
                    "    \"aspect_ratio\": 1.49925,\n" +
                    "    \"author\": \"Robin Williams\",\n" +
                    "    \"title\": \"Agriculturist's Weekly Update, Delivered Once Daily, 24/7\",\n" +
                    "    \"published_date\": \"2013-01-15T00:00:00.000Z\",\n" +
                    "    \"body\": \"Paroxysm of global economics <a href='http://www.google.com'>Google Search</a> event take root and flourish, realm of the galaxies take root and flourish light years, circumnavigated Tunguska event Vangelis. Realm of the galaxies as a patch of light extraplanetary?<br><br>The carbon in our apple pies hundreds of thousands of brilliant syntheses cosmic ocean Hypatia explorations across the centuries take root and flourish muse about with pretty stories for which there's little good evidence. Tunguska event birth billions upon billions venture tesseract billions upon billions! Muse about dream of the mind's eye! Radio telescope. The only home we've ever known with pretty stories for which there's little good evidence! Hydrogen atoms cosmic fugue brain is the seed of intelligence the only home we've ever known? Inconspicuous motes of rock and gas of brilliant syntheses.<br><br>Network of wormholes across the centuries Jean-Fran�ois Champollion hearts of the stars? Vastness is bearable only through love, a still more glorious dawn awaits worldlets the carbon in our apple pies worldlets citizens of distant epochs corpus callosum quasar ship of the imagination. Colonies something incredible is waiting to be known from which we spring billions upon billions, paroxysm of global death with pretty stories for which there's little good evidence, intelligent beings astonishment.<br><br>Brain is the seed of intelligence, billions upon billions, corpus callosum trillion stirred by starlight consciousness cosmic fugue dispassionate extraterrestrial observer.<br><br>Bits of moving fluff. Muse about Apollonius of Perga worldlets the only home we've ever known dispassionate extraterrestrial observer with pretty stories for which there's little good evidence venture at the edge of forever, laws of physics muse about.<br><br>Photos courtesy of <a href='https://unsplash.com/'>Unsplash.com</a>.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"id\": \"9\",\n" +
                    "    \"photo\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/images/p009.jpg\",\n" +
                    "    \"thumb\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/thumbs/p009.jpg\",\n" +
                    "    \"aspect_ratio\": 1,\n" +
                    "    \"author\": \"Jacqueline Kennedy Onasis\",\n" +
                    "    \"title\": \"Brooklyn Sidewalks Anonymous\",\n" +
                    "    \"published_date\": \"2013-01-14T00:00:00.000Z\",\n" +
                    "    \"body\": \"Paroxysm of global economics <a href='http://www.google.com'>Google Search</a> event take root and flourish, realm of the galaxies take root and flourish light years, circumnavigated Tunguska event Vangelis. Realm of the galaxies as a patch of light extraplanetary?<br><br>The carbon in our apple pies hundreds of thousands of brilliant syntheses cosmic ocean Hypatia explorations across the centuries take root and flourish muse about with pretty stories for which there's little good evidence. Tunguska event birth billions upon billions venture tesseract billions upon billions! Muse about dream of the mind's eye! Radio telescope. The only home we've ever known with pretty stories for which there's little good evidence! Hydrogen atoms cosmic fugue brain is the seed of intelligence the only home we've ever known? Inconspicuous motes of rock and gas of brilliant syntheses.<br><br>Network of wormholes across the centuries Jean-Fran�ois Champollion hearts of the stars? Vastness is bearable only through love, a still more glorious dawn awaits worldlets the carbon in our apple pies worldlets citizens of distant epochs corpus callosum quasar ship of the imagination. Colonies something incredible is waiting to be known from which we spring billions upon billions, paroxysm of global death with pretty stories for which there's little good evidence, intelligent beings astonishment.<br><br>Brain is the seed of intelligence, billions upon billions, corpus callosum trillion stirred by starlight consciousness cosmic fugue dispassionate extraterrestrial observer.<br><br>Bits of moving fluff. Muse about Apollonius of Perga worldlets the only home we've ever known dispassionate extraterrestrial observer with pretty stories for which there's little good evidence venture at the edge of forever, laws of physics muse about.<br><br>Photos courtesy of <a href='https://unsplash.com/'>Unsplash.com</a>.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"id\": \"10\",\n" +
                    "    \"photo\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/images/p010.jpg\",\n" +
                    "    \"thumb\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/thumbs/p010.jpg\",\n" +
                    "    \"aspect_ratio\": 1.49925,\n" +
                    "    \"author\": \"Pablo Picasso\",\n" +
                    "    \"title\": \"3 Great Dessert Recipes for This Weekend\",\n" +
                    "    \"published_date\": \"2013-01-13T00:00:00.000Z\",\n" +
                    "    \"body\": \"Paroxysm of global economics <a href='http://www.google.com'>Google Search</a> event take root and flourish, realm of the galaxies take root and flourish light years, circumnavigated Tunguska event Vangelis. Realm of the galaxies as a patch of light extraplanetary?<br><br>The carbon in our apple pies hundreds of thousands of brilliant syntheses cosmic ocean Hypatia explorations across the centuries take root and flourish muse about with pretty stories for which there's little good evidence. Tunguska event birth billions upon billions venture tesseract billions upon billions! Muse about dream of the mind's eye! Radio telescope. The only home we've ever known with pretty stories for which there's little good evidence! Hydrogen atoms cosmic fugue brain is the seed of intelligence the only home we've ever known? Inconspicuous motes of rock and gas of brilliant syntheses.<br><br>Network of wormholes across the centuries Jean-Fran�ois Champollion hearts of the stars? Vastness is bearable only through love, a still more glorious dawn awaits worldlets the carbon in our apple pies worldlets citizens of distant epochs corpus callosum quasar ship of the imagination. Colonies something incredible is waiting to be known from which we spring billions upon billions, paroxysm of global death with pretty stories for which there's little good evidence, intelligent beings astonishment.<br><br>Brain is the seed of intelligence, billions upon billions, corpus callosum trillion stirred by starlight consciousness cosmic fugue dispassionate extraterrestrial observer.<br><br>Bits of moving fluff. Muse about Apollonius of Perga worldlets the only home we've ever known dispassionate extraterrestrial observer with pretty stories for which there's little good evidence venture at the edge of forever, laws of physics muse about.<br><br>Photos courtesy of <a href='https://unsplash.com/'>Unsplash.com</a>.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"id\": \"6\",\n" +
                    "    \"photo\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/images/p006.jpg\",\n" +
                    "    \"thumb\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/thumbs/p006.jpg\",\n" +
                    "    \"aspect_ratio\": 1.49925,\n" +
                    "    \"author\": \"Margaret Thatcher\",\n" +
                    "    \"title\": \"TV in Modern Beach Environments\",\n" +
                    "    \"published_date\": \"2013-01-12T00:00:00.000Z\",\n" +
                    "    \"body\": \"Paroxysm of global economics <a href='http://www.google.com'>Google Search</a> event take root and flourish, realm of the galaxies take root and flourish light years, circumnavigated Tunguska event Vangelis. Realm of the galaxies as a patch of light extraplanetary?<br><br>The carbon in our apple pies hundreds of thousands of brilliant syntheses cosmic ocean Hypatia explorations across the centuries take root and flourish muse about with pretty stories for which there's little good evidence. Tunguska event birth billions upon billions venture tesseract billions upon billions! Muse about dream of the mind's eye! Radio telescope. The only home we've ever known with pretty stories for which there's little good evidence! Hydrogen atoms cosmic fugue brain is the seed of intelligence the only home we've ever known? Inconspicuous motes of rock and gas of brilliant syntheses.<br><br>Network of wormholes across the centuries Jean-Fran�ois Champollion hearts of the stars? Vastness is bearable only through love, a still more glorious dawn awaits worldlets the carbon in our apple pies worldlets citizens of distant epochs corpus callosum quasar ship of the imagination. Colonies something incredible is waiting to be known from which we spring billions upon billions, paroxysm of global death with pretty stories for which there's little good evidence, intelligent beings astonishment.<br><br>Brain is the seed of intelligence, billions upon billions, corpus callosum trillion stirred by starlight consciousness cosmic fugue dispassionate extraterrestrial observer.<br><br>Bits of moving fluff. Muse about Apollonius of Perga worldlets the only home we've ever known dispassionate extraterrestrial observer with pretty stories for which there's little good evidence venture at the edge of forever, laws of physics muse about.<br><br>Photos courtesy of <a href='https://unsplash.com/'>Unsplash.com</a>.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"id\": \"12\",\n" +
                    "    \"photo\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/images/p012.jpg\",\n" +
                    "    \"thumb\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/thumbs/p012.jpg\",\n" +
                    "    \"aspect_ratio\": 1,\n" +
                    "    \"author\": \"Ernest Hemingway\",\n" +
                    "    \"title\": \"What I Found While Swimming\",\n" +
                    "    \"published_date\": \"2013-01-12T00:00:00.000Z\",\n" +
                    "    \"body\": \"Paroxysm of global economics <a href='http://www.google.com'>Google Search</a> event take root and flourish, realm of the galaxies take root and flourish light years, circumnavigated Tunguska event Vangelis. Realm of the galaxies as a patch of light extraplanetary?<br><br>The carbon in our apple pies hundreds of thousands of brilliant syntheses cosmic ocean Hypatia explorations across the centuries take root and flourish muse about with pretty stories for which there's little good evidence. Tunguska event birth billions upon billions venture tesseract billions upon billions! Muse about dream of the mind's eye! Radio telescope. The only home we've ever known with pretty stories for which there's little good evidence! Hydrogen atoms cosmic fugue brain is the seed of intelligence the only home we've ever known? Inconspicuous motes of rock and gas of brilliant syntheses.<br><br>Network of wormholes across the centuries Jean-Fran�ois Champollion hearts of the stars? Vastness is bearable only through love, a still more glorious dawn awaits worldlets the carbon in our apple pies worldlets citizens of distant epochs corpus callosum quasar ship of the imagination. Colonies something incredible is waiting to be known from which we spring billions upon billions, paroxysm of global death with pretty stories for which there's little good evidence, intelligent beings astonishment.<br><br>Brain is the seed of intelligence, billions upon billions, corpus callosum trillion stirred by starlight consciousness cosmic fugue dispassionate extraterrestrial observer.<br><br>Bits of moving fluff. Muse about Apollonius of Perga worldlets the only home we've ever known dispassionate extraterrestrial observer with pretty stories for which there's little good evidence venture at the edge of forever, laws of physics muse about.<br><br>Photos courtesy of <a href='https://unsplash.com/'>Unsplash.com</a>.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"id\": \"13\",\n" +
                    "    \"photo\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/images/p013.jpg\",\n" +
                    "    \"thumb\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/thumbs/p013.jpg\",\n" +
                    "    \"aspect_ratio\": 1.49925,\n" +
                    "    \"author\": \"Ernest Hemingway\",\n" +
                    "    \"title\": \"Bourgeois Office Furniture\",\n" +
                    "    \"published_date\": \"2013-01-12T00:00:00.000Z\",\n" +
                    "    \"body\": \"Paroxysm of global economics <a href='http://www.google.com'>Google Search</a> event take root and flourish, realm of the galaxies take root and flourish light years, circumnavigated Tunguska event Vangelis. Realm of the galaxies as a patch of light extraplanetary?<br><br>The carbon in our apple pies hundreds of thousands of brilliant syntheses cosmic ocean Hypatia explorations across the centuries take root and flourish muse about with pretty stories for which there's little good evidence. Tunguska event birth billions upon billions venture tesseract billions upon billions! Muse about dream of the mind's eye! Radio telescope. The only home we've ever known with pretty stories for which there's little good evidence! Hydrogen atoms cosmic fugue brain is the seed of intelligence the only home we've ever known? Inconspicuous motes of rock and gas of brilliant syntheses.<br><br>Network of wormholes across the centuries Jean-Fran�ois Champollion hearts of the stars? Vastness is bearable only through love, a still more glorious dawn awaits worldlets the carbon in our apple pies worldlets citizens of distant epochs corpus callosum quasar ship of the imagination. Colonies something incredible is waiting to be known from which we spring billions upon billions, paroxysm of global death with pretty stories for which there's little good evidence, intelligent beings astonishment.<br><br>Brain is the seed of intelligence, billions upon billions, corpus callosum trillion stirred by starlight consciousness cosmic fugue dispassionate extraterrestrial observer.<br><br>Bits of moving fluff. Muse about Apollonius of Perga worldlets the only home we've ever known dispassionate extraterrestrial observer with pretty stories for which there's little good evidence venture at the edge of forever, laws of physics muse about.<br><br>Photos courtesy of <a href='https://unsplash.com/'>Unsplash.com</a>.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"id\": \"14\",\n" +
                    "    \"photo\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/images/p014.jpg\",\n" +
                    "    \"thumb\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/thumbs/p014.jpg\",\n" +
                    "    \"aspect_ratio\": 1.49925,\n" +
                    "    \"author\": \"Ernest Hemingway\",\n" +
                    "    \"title\": \"String Beans and What They Mean for You\",\n" +
                    "    \"published_date\": \"2013-01-12T00:00:00.000Z\",\n" +
                    "    \"body\": \"Paroxysm of global economics <a href='http://www.google.com'>Google Search</a> event take root and flourish, realm of the galaxies take root and flourish light years, circumnavigated Tunguska event Vangelis. Realm of the galaxies as a patch of light extraplanetary?<br><br>The carbon in our apple pies hundreds of thousands of brilliant syntheses cosmic ocean Hypatia explorations across the centuries take root and flourish muse about with pretty stories for which there's little good evidence. Tunguska event birth billions upon billions venture tesseract billions upon billions! Muse about dream of the mind's eye! Radio telescope. The only home we've ever known with pretty stories for which there's little good evidence! Hydrogen atoms cosmic fugue brain is the seed of intelligence the only home we've ever known? Inconspicuous motes of rock and gas of brilliant syntheses.<br><br>Network of wormholes across the centuries Jean-Fran�ois Champollion hearts of the stars? Vastness is bearable only through love, a still more glorious dawn awaits worldlets the carbon in our apple pies worldlets citizens of distant epochs corpus callosum quasar ship of the imagination. Colonies something incredible is waiting to be known from which we spring billions upon billions, paroxysm of global death with pretty stories for which there's little good evidence, intelligent beings astonishment.<br><br>Brain is the seed of intelligence, billions upon billions, corpus callosum trillion stirred by starlight consciousness cosmic fugue dispassionate extraterrestrial observer.<br><br>Bits of moving fluff. Muse about Apollonius of Perga worldlets the only home we've ever known dispassionate extraterrestrial observer with pretty stories for which there's little good evidence venture at the edge of forever, laws of physics muse about.<br><br>Photos courtesy of <a href='https://unsplash.com/'>Unsplash.com</a>.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"id\": \"15\",\n" +
                    "    \"photo\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/images/p015.jpg\",\n" +
                    "    \"thumb\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/thumbs/p015.jpg\",\n" +
                    "    \"aspect_ratio\": 1.50602,\n" +
                    "    \"author\": \"Ernest Hemingway\",\n" +
                    "    \"title\": \"I Can't Get Enough Fantastic Sunsets\",\n" +
                    "    \"published_date\": \"2013-01-12T00:00:00.000Z\",\n" +
                    "    \"body\": \"Paroxysm of global economics <a href='http://www.google.com'>Google Search</a> event take root and flourish, realm of the galaxies take root and flourish light years, circumnavigated Tunguska event Vangelis. Realm of the galaxies as a patch of light extraplanetary?<br><br>The carbon in our apple pies hundreds of thousands of brilliant syntheses cosmic ocean Hypatia explorations across the centuries take root and flourish muse about with pretty stories for which there's little good evidence. Tunguska event birth billions upon billions venture tesseract billions upon billions! Muse about dream of the mind's eye! Radio telescope. The only home we've ever known with pretty stories for which there's little good evidence! Hydrogen atoms cosmic fugue brain is the seed of intelligence the only home we've ever known? Inconspicuous motes of rock and gas of brilliant syntheses.<br><br>Network of wormholes across the centuries Jean-Fran�ois Champollion hearts of the stars? Vastness is bearable only through love, a still more glorious dawn awaits worldlets the carbon in our apple pies worldlets citizens of distant epochs corpus callosum quasar ship of the imagination. Colonies something incredible is waiting to be known from which we spring billions upon billions, paroxysm of global death with pretty stories for which there's little good evidence, intelligent beings astonishment.<br><br>Brain is the seed of intelligence, billions upon billions, corpus callosum trillion stirred by starlight consciousness cosmic fugue dispassionate extraterrestrial observer.<br><br>Bits of moving fluff. Muse about Apollonius of Perga worldlets the only home we've ever known dispassionate extraterrestrial observer with pretty stories for which there's little good evidence venture at the edge of forever, laws of physics muse about.<br><br>Photos courtesy of <a href='https://unsplash.com/'>Unsplash.com</a>.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"id\": \"16\",\n" +
                    "    \"photo\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/images/p016.jpg\",\n" +
                    "    \"thumb\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/thumbs/p016.jpg\",\n" +
                    "    \"aspect_ratio\": 1.50602,\n" +
                    "    \"author\": \"Ernest Hemingway\",\n" +
                    "    \"title\": \"The Beauty That is Mount Pumpkinfoot\",\n" +
                    "    \"published_date\": \"2013-01-12T00:00:00.000Z\",\n" +
                    "    \"body\": \"Paroxysm of global economics <a href='http://www.google.com'>Google Search</a> event take root and flourish, realm of the galaxies take root and flourish light years, circumnavigated Tunguska event Vangelis. Realm of the galaxies as a patch of light extraplanetary?<br><br>The carbon in our apple pies hundreds of thousands of brilliant syntheses cosmic ocean Hypatia explorations across the centuries take root and flourish muse about with pretty stories for which there's little good evidence. Tunguska event birth billions upon billions venture tesseract billions upon billions! Muse about dream of the mind's eye! Radio telescope. The only home we've ever known with pretty stories for which there's little good evidence! Hydrogen atoms cosmic fugue brain is the seed of intelligence the only home we've ever known? Inconspicuous motes of rock and gas of brilliant syntheses.<br><br>Network of wormholes across the centuries Jean-Fran�ois Champollion hearts of the stars? Vastness is bearable only through love, a still more glorious dawn awaits worldlets the carbon in our apple pies worldlets citizens of distant epochs corpus callosum quasar ship of the imagination. Colonies something incredible is waiting to be known from which we spring billions upon billions, paroxysm of global death with pretty stories for which there's little good evidence, intelligent beings astonishment.<br><br>Brain is the seed of intelligence, billions upon billions, corpus callosum trillion stirred by starlight consciousness cosmic fugue dispassionate extraterrestrial observer.<br><br>Bits of moving fluff. Muse about Apollonius of Perga worldlets the only home we've ever known dispassionate extraterrestrial observer with pretty stories for which there's little good evidence venture at the edge of forever, laws of physics muse about.<br><br>Photos courtesy of <a href='https://unsplash.com/'>Unsplash.com</a>.\"\n" +
                    "  },\n" +
                    "  {\n" +
                    "    \"id\": \"17\",\n" +
                    "    \"photo\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/images/p017.jpg\",\n" +
                    "    \"thumb\": \"https://dl.dropboxusercontent.com/u/231329/xyzreader_data/thumbs/p017.jpg\",\n" +
                    "    \"aspect_ratio\": 1.11235,\n" +
                    "    \"author\": \"Ernest Hemingway\",\n" +
                    "    \"title\": \"Busy Streets Are Still Busy, Even If You Don't Want Them To Be\",\n" +
                    "    \"published_date\": \"2013-01-12T00:00:00.000Z\",\n" +
                    "    \"body\": \"Paroxysm of global economics <a href='http://www.google.com'>Google Search</a> event take root and flourish, realm of the galaxies take root and flourish light years, circumnavigated Tunguska event Vangelis. Realm of the galaxies as a patch of light extraplanetary?<br><br>The carbon in our apple pies hundreds of thousands of brilliant syntheses cosmic ocean Hypatia explorations across the centuries take root and flourish muse about with pretty stories for which there's little good evidence. Tunguska event birth billions upon billions venture tesseract billions upon billions! Muse about dream of the mind's eye! Radio telescope. The only home we've ever known with pretty stories for which there's little good evidence! Hydrogen atoms cosmic fugue brain is the seed of intelligence the only home we've ever known? Inconspicuous motes of rock and gas of brilliant syntheses.<br><br>Network of wormholes across the centuries Jean-Fran�ois Champollion hearts of the stars? Vastness is bearable only through love, a still more glorious dawn awaits worldlets the carbon in our apple pies worldlets citizens of distant epochs corpus callosum quasar ship of the imagination. Colonies something incredible is waiting to be known from which we spring billions upon billions, paroxysm of global death with pretty stories for which there's little good evidence, intelligent beings astonishment.<br><br>Brain is the seed of intelligence, billions upon billions, corpus callosum trillion stirred by starlight consciousness cosmic fugue dispassionate extraterrestrial observer.<br><br>Bits of moving fluff. Muse about Apollonius of Perga worldlets the only home we've ever known dispassionate extraterrestrial observer with pretty stories for which there's little good evidence venture at the edge of forever, laws of physics muse about.<br><br>Photos courtesy of <a href='https://unsplash.com/'>Unsplash.com</a>.\"\n" +
                    "  }\n" +
                    "]";
        } catch (Exception e) {
            Log.e(TAG, "aqui inicia"+okHttpClient);
            e.printStackTrace();
            Log.e(TAG, "hola estoy aqui "+url);
        }
        return retorna;
    }


}
