package org.wikipedia.tests;

import org.testng.annotations.Test;

public class ArticleTest extends TestBase{

    @Test
    public void testAddArticleToFavoritesAndRemove() {
        System.out.println("app opened");
        app.getArticle().search("TCP/IP");
        app.getArticle().addToFavorites();
        app.getArticle().createReadingList("MyFavorites");
        app.getArticle().close();

        // remove from favorites


    }
}
