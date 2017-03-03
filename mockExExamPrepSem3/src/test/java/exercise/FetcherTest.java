/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author Janus
 */
@RunWith(MockitoJUnitRunner.class)
public class FetcherTest {
    @Mock
    String jokepath;
    
    public FetcherTest() {
    }
    
    @Before
    public void setUp() {
    }
    @Test
    public void jokeTest() throws CommunicationException{
        Fetcher fetch = new Fetcher(jokepath);
        assertTrue(fetch.fetchJoke() instanceof Joke);
    }
    
    @Test(expected = Exception.class)
    public void testMailError() throws Exception{
        Fetcher fetch = new Fetcher(jokepath);
        fetch.fetchJoke();
        assertTrue(false);
        
    }
}
