public class Tile {

    private BoundingBox boundingBox;
    private Vec2 position;
    private int tileSize = 70;

    Tile(float x,float y){
        this.boundingBox = new BoundingBox(x,x+tileSize,y-tileSize,y);
        this.position = new Vec2(x,y);
    }

    /*
    Klasse erhält eine Boundingbox und muss sich selbst instanzieren können.

    Standort über Vektor in einer Menge von Kacheln.
    -> Einfachste Lösung wäre sowohl x.min als auch y.min auszulesen aus der Boundingbox.

    Konstruktor würde also eine Boundingbox übergeben bekommen, über welche man dann die
    jeweilige Sebstinstanzierung vornehmen würde.

    Tile würden beim Aufbau des Bildes miterstellt werden.
    Jeweil eine Tile für ein 70x70 Objekt.

    ->Kollision von oben y.max
    ->Kollision von unten y.min
    ->Kollision von links x.min
    ->Kollision von rechts x.max

    BoundingBox für Player =
    ->y.min = y + model.height
    ->y.max = y
    ->x.min = x
    ->x.max = x+ model.width

    BoundingBox für Tiles =
    ->y.min = y + 70
    ->y.max = y
    ->x.min = x
    ->x.max = x+ 70

    Alle Tiles in eine Liste packen.
    Liste als Feld in Level anlegen zu dem hinzugefügt wird.

    Mit Hilfe eines Streams nacheinander prüfen, ob es an irgendeiner Stelle
    eine Kollision mit einem Tile gegben hat.

     */

    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    public int getTileSize() {
        return tileSize;
    }

    public Vec2 getPosition() {
        return position;
    }
}
