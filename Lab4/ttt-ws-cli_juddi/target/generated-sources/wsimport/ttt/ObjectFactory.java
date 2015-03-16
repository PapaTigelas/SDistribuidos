
package ttt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ttt package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Play_QNAME = new QName("http://ttt/", "play");
    private final static QName _CheckWinner_QNAME = new QName("http://ttt/", "checkWinner");
    private final static QName _Last3Plays_QNAME = new QName("http://ttt/", "last3Plays");
    private final static QName _PlayResponse_QNAME = new QName("http://ttt/", "playResponse");
    private final static QName _CurrentBoardResponse_QNAME = new QName("http://ttt/", "currentBoardResponse");
    private final static QName _Last3PlaysResponse_QNAME = new QName("http://ttt/", "last3PlaysResponse");
    private final static QName _CheckWinnerResponse_QNAME = new QName("http://ttt/", "checkWinnerResponse");
    private final static QName _CurrentBoard_QNAME = new QName("http://ttt/", "currentBoard");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ttt
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Play }
     * 
     */
    public Play createPlay() {
        return new Play();
    }

    /**
     * Create an instance of {@link CheckWinner }
     * 
     */
    public CheckWinner createCheckWinner() {
        return new CheckWinner();
    }

    /**
     * Create an instance of {@link PlayResponse }
     * 
     */
    public PlayResponse createPlayResponse() {
        return new PlayResponse();
    }

    /**
     * Create an instance of {@link CurrentBoardResponse }
     * 
     */
    public CurrentBoardResponse createCurrentBoardResponse() {
        return new CurrentBoardResponse();
    }

    /**
     * Create an instance of {@link Last3Plays }
     * 
     */
    public Last3Plays createLast3Plays() {
        return new Last3Plays();
    }

    /**
     * Create an instance of {@link Last3PlaysResponse }
     * 
     */
    public Last3PlaysResponse createLast3PlaysResponse() {
        return new Last3PlaysResponse();
    }

    /**
     * Create an instance of {@link CheckWinnerResponse }
     * 
     */
    public CheckWinnerResponse createCheckWinnerResponse() {
        return new CheckWinnerResponse();
    }

    /**
     * Create an instance of {@link CurrentBoard }
     * 
     */
    public CurrentBoard createCurrentBoard() {
        return new CurrentBoard();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Play }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ttt/", name = "play")
    public JAXBElement<Play> createPlay(Play value) {
        return new JAXBElement<Play>(_Play_QNAME, Play.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckWinner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ttt/", name = "checkWinner")
    public JAXBElement<CheckWinner> createCheckWinner(CheckWinner value) {
        return new JAXBElement<CheckWinner>(_CheckWinner_QNAME, CheckWinner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Last3Plays }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ttt/", name = "last3Plays")
    public JAXBElement<Last3Plays> createLast3Plays(Last3Plays value) {
        return new JAXBElement<Last3Plays>(_Last3Plays_QNAME, Last3Plays.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ttt/", name = "playResponse")
    public JAXBElement<PlayResponse> createPlayResponse(PlayResponse value) {
        return new JAXBElement<PlayResponse>(_PlayResponse_QNAME, PlayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentBoardResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ttt/", name = "currentBoardResponse")
    public JAXBElement<CurrentBoardResponse> createCurrentBoardResponse(CurrentBoardResponse value) {
        return new JAXBElement<CurrentBoardResponse>(_CurrentBoardResponse_QNAME, CurrentBoardResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Last3PlaysResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ttt/", name = "last3PlaysResponse")
    public JAXBElement<Last3PlaysResponse> createLast3PlaysResponse(Last3PlaysResponse value) {
        return new JAXBElement<Last3PlaysResponse>(_Last3PlaysResponse_QNAME, Last3PlaysResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckWinnerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ttt/", name = "checkWinnerResponse")
    public JAXBElement<CheckWinnerResponse> createCheckWinnerResponse(CheckWinnerResponse value) {
        return new JAXBElement<CheckWinnerResponse>(_CheckWinnerResponse_QNAME, CheckWinnerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentBoard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ttt/", name = "currentBoard")
    public JAXBElement<CurrentBoard> createCurrentBoard(CurrentBoard value) {
        return new JAXBElement<CurrentBoard>(_CurrentBoard_QNAME, CurrentBoard.class, null, value);
    }

}
