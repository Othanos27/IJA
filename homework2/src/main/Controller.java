package main;

import Order.IOrder;
import Order.Order;
import ija.ija2020.homework1.goods.Goods;
import ija.ija2020.homework1.goods.GoodsItem;
import ija.ija2020.homework1.goods.GoodsShelf;
import ija.ija2020.homework1.store.StoreGoods;
import ija.ija2020.homework1.store.StoreShelf;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URL;
import java.time.LocalDate;
import java.util.*;
import java.util.Map.Entry;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;
import map.WarehouseMap;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Controller implements Initializable {
    WarehouseMap warehouse = new WarehouseMap();
    ArrayList<Order> orders = new ArrayList();
    HashMap<String, Integer> mapGoods = new HashMap<>();

    @FXML
    private AnchorPane pane;

    @FXML
    private Pane popup;

    final ArrayList<Rectangle> rectangles = new ArrayList();

    @FXML
    private Label labelRegal;
    @FXML
    private Label labelObsahuje;
    @FXML
    private Label labelOrder;
    @FXML
    private Label labelTrasa;

    @FXML
    private Label labelPopup;
    @FXML
    private Label labelErrorPopup;

    @FXML
    private Button buttonNaplnSklad;

    @FXML
    private ListView listViewOrder;

    @FXML
    private Spinner spinnerOrder;

    public void initialize(URL url, ResourceBundle rb) {
        this.popup.setVisible(false);
    }

    private void fillRectangleList() {
        this.rectangles.add(this.Regal_1);
        this.rectangles.add(this.Regal_2);
        this.rectangles.add(this.Regal_3);
        this.rectangles.add(this.Regal_4);
        this.rectangles.add(this.Regal_5);
        this.rectangles.add(this.Regal_6);
        this.rectangles.add(this.Regal_7);
        this.rectangles.add(this.Regal_8);
        this.rectangles.add(this.Regal_9);
        this.rectangles.add(this.Regal_10);
        this.rectangles.add(this.Regal_11);
        this.rectangles.add(this.Regal_12);
        this.rectangles.add(this.Regal_13);
        this.rectangles.add(this.Regal_14);
        this.rectangles.add(this.Regal_15);
        this.rectangles.add(this.Regal_16);
        this.rectangles.add(this.Regal_17);
        this.rectangles.add(this.Regal_18);
        this.rectangles.add(this.Regal_19);
        this.rectangles.add(this.Regal_20);
        this.rectangles.add(this.Regal_21);
        this.rectangles.add(this.Regal_22);
        this.rectangles.add(this.Regal_23);
        this.rectangles.add(this.Regal_24);
        this.rectangles.add(this.Regal_25);
        this.rectangles.add(this.Regal_26);
        this.rectangles.add(this.Regal_27);
        this.rectangles.add(this.Regal_28);
        this.rectangles.add(this.Regal_29);
        this.rectangles.add(this.Regal_30);
        this.rectangles.add(this.Regal_31);
        this.rectangles.add(this.Regal_32);
        this.rectangles.add(this.Regal_33);
        this.rectangles.add(this.Regal_34);
        this.rectangles.add(this.Regal_35);
        this.rectangles.add(this.Regal_36);
        this.rectangles.add(this.Regal_37);
        this.rectangles.add(this.Regal_38);
        this.rectangles.add(this.Regal_39);
        this.rectangles.add(this.Regal_40);
        this.rectangles.add(this.Regal_41);
        this.rectangles.add(this.Regal_42);
        this.rectangles.add(this.Regal_43);
        this.rectangles.add(this.Regal_44);
        this.rectangles.add(this.Regal_45);
        this.rectangles.add(this.Regal_46);
        this.rectangles.add(this.Regal_47);
        this.rectangles.add(this.Regal_48);
        this.rectangles.add(this.Regal_49);
        this.rectangles.add(this.Regal_50);
        this.rectangles.add(this.Regal_51);
        this.rectangles.add(this.Regal_52);
        this.rectangles.add(this.Regal_53);
        this.rectangles.add(this.Regal_54);
        this.rectangles.add(this.Regal_55);
        this.rectangles.add(this.Regal_56);
        this.rectangles.add(this.Regal_57);
        this.rectangles.add(this.Regal_58);
        this.rectangles.add(this.Regal_59);
        this.rectangles.add(this.Regal_60);
        this.rectangles.add(this.Regal_61);
        this.rectangles.add(this.Regal_62);
        this.rectangles.add(this.Regal_63);
        this.rectangles.add(this.Regal_64);
        this.rectangles.add(this.Regal_65);
        this.rectangles.add(this.Regal_66);
        this.rectangles.add(this.Regal_67);
        this.rectangles.add(this.Regal_68);
        this.rectangles.add(this.Regal_69);
        this.rectangles.add(this.Regal_70);
        this.rectangles.add(this.Regal_71);
        this.rectangles.add(this.Regal_72);
        this.rectangles.add(this.Regal_73);
        this.rectangles.add(this.Regal_74);
        this.rectangles.add(this.Regal_75);
        this.rectangles.add(this.Regal_76);
        this.rectangles.add(this.Regal_77);
        this.rectangles.add(this.Regal_78);
        this.rectangles.add(this.Regal_79);
        this.rectangles.add(this.Regal_80);
        this.rectangles.add(this.Regal_81);
        this.rectangles.add(this.Regal_82);
        this.rectangles.add(this.Regal_83);
        this.rectangles.add(this.Regal_84);
        this.rectangles.add(this.Regal_85);
        this.rectangles.add(this.Regal_86);
        this.rectangles.add(this.Regal_87);
        this.rectangles.add(this.Regal_88);
        this.rectangles.add(this.Regal_89);
        this.rectangles.add(this.Regal_90);
        this.rectangles.add(this.Regal_91);
        this.rectangles.add(this.Regal_92);
        this.rectangles.add(this.Regal_93);
        this.rectangles.add(this.Regal_94);
        this.rectangles.add(this.Regal_95);
        this.rectangles.add(this.Regal_96);
        this.rectangles.add(this.Regal_97);
        this.rectangles.add(this.Regal_98);
        this.rectangles.add(this.Regal_99);
        this.rectangles.add(this.Regal_100);
        this.rectangles.add(this.Regal_101);
        this.rectangles.add(this.Regal_102);
        this.rectangles.add(this.Regal_103);
        this.rectangles.add(this.Regal_104);
        this.rectangles.add(this.Regal_105);
        this.rectangles.add(this.Regal_106);
        this.rectangles.add(this.Regal_107);
        this.rectangles.add(this.Regal_108);
        this.rectangles.add(this.Regal_109);
        this.rectangles.add(this.Regal_110);
        this.rectangles.add(this.Regal_111);
        this.rectangles.add(this.Regal_112);
        this.rectangles.add(this.Regal_113);
        this.rectangles.add(this.Regal_114);
        this.rectangles.add(this.Regal_115);
        this.rectangles.add(this.Regal_116);
        this.rectangles.add(this.Regal_117);
        this.rectangles.add(this.Regal_118);
        this.rectangles.add(this.Regal_119);
        this.rectangles.add(this.Regal_120);
        this.rectangles.add(this.Regal_121);
        this.rectangles.add(this.Regal_122);
        this.rectangles.add(this.Regal_124);
        this.rectangles.add(this.Regal_125);
        this.rectangles.add(this.Regal_126);
        this.rectangles.add(this.Regal_127);
        this.rectangles.add(this.Regal_128);
        this.rectangles.add(this.Regal_129);
        this.rectangles.add(this.Regal_130);
        this.rectangles.add(this.Regal_131);
        this.rectangles.add(this.Regal_132);
        this.rectangles.add(this.Regal_133);
        this.rectangles.add(this.Regal_134);
        this.rectangles.add(this.Regal_135);
        this.rectangles.add(this.Regal_136);
        this.rectangles.add(this.Regal_137);
        this.rectangles.add(this.Regal_138);
        this.rectangles.add(this.Regal_139);
        this.rectangles.add(this.Regal_140);
        this.rectangles.add(this.Regal_141);
        this.rectangles.add(this.Regal_142);
        this.rectangles.add(this.Regal_143);
        this.rectangles.add(this.Regal_144);
        this.rectangles.add(this.Regal_145);
        this.rectangles.add(this.Regal_146);
        this.rectangles.add(this.Regal_147);
        this.rectangles.add(this.Regal_148);
        this.rectangles.add(this.Regal_149);
        this.rectangles.add(this.Regal_150);
        this.rectangles.add(this.Regal_151);
        this.rectangles.add(this.Regal_152);
        this.rectangles.add(this.Regal_153);
        this.rectangles.add(this.Regal_154);
        this.rectangles.add(this.Regal_155);
        this.rectangles.add(this.Regal_156);
        this.rectangles.add(this.Regal_157);
        this.rectangles.add(this.Regal_158);
        this.rectangles.add(this.Regal_159);
        this.rectangles.add(this.Regal_160);
    }

    @FXML
    public void showName(MouseEvent event) {
        String regalID = ((Rectangle)event.getSource()).getId().toString();
        String[] split = regalID.split("_", 2);
        int id = Integer.parseInt(split[1]);
        this.labelRegal.setText("Regal " + id);
        this.labelObsahuje.setText("Obsahuje: ");
        Iterator it = this.warehouse.getList().iterator();

        while(it.hasNext()) {
            GoodsShelf shelf = (GoodsShelf)it.next();
            if (shelf.getNumber() == id) {
                this.labelObsahuje.setText("Obsahuje: " + shelf.obsah());
                break;
            }
        }
    }

    @FXML
    public void hideName() {
        this.labelRegal.setText("Najeďte na regál");
        this.labelObsahuje.setText("");
    }

    @FXML
    public void fillWarehouse() {
        FileChooser fileChooser = new FileChooser();
        JSONParser parser = new JSONParser();
        File dir = new File("./data");
        fileChooser.setInitialDirectory(dir);

        fileChooser.setTitle("Vyberte soubor s příponou '.json'");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Soubory JSON", "*.json"));
        File warehouseFile = fileChooser.showOpenDialog(buttonNaplnSklad.getScene().getWindow());

        try {
            Reader reader = new FileReader(warehouseFile);
            Throwable var5 = null;

            try {
                JSONObject obj = (JSONObject)parser.parse(reader);
                JSONObject shelfObj = (JSONObject)obj.get("regaly");
                Iterator it = shelfObj.entrySet().iterator();

                while(it.hasNext()) {
                    Entry map = (Entry)it.next();
                    GoodsShelf storeShelf = new StoreShelf(Integer.parseInt(map.getKey().toString()));
                    Map shelf = (Map)shelfObj.get(map.getKey());
                    Iterator shelfIt = shelf.entrySet().iterator();

                    while(shelfIt.hasNext()) {
                        Entry shelfMap = (Entry)shelfIt.next();
                        Goods good = new StoreGoods(shelfMap.getKey().toString());

                        for(int i = 0; i < Integer.parseInt(shelfMap.getValue().toString()); ++i) {
                            GoodsItem item = good.newItem(LocalDate.now());
                            storeShelf.put(item);
                        }
                    }
                    this.warehouse.addShelf(storeShelf);
                }
            } catch (Throwable var26) {
                throw var26;
            } finally {
                if (reader != null) {
                    if (var5 != null) {
                        try {
                            reader.close();
                        } catch (Throwable var25) {
                            var5.addSuppressed(var25);
                        }
                    } else {
                        reader.close();
                    }
                }
            }
        } catch (ParseException | IOException var28) {
            System.out.println("Couldnt open file");
        }
    }

    @FXML
    public void executeOrder() {
        this.fillRectangleList();
        String printTrasa = "";
        if (this.warehouse.executeOrder(this.orders)) {
            Map<Integer, List<Order>> map = this.warehouse.getPath(this.orders);
            Iterator var3 = map.entrySet().iterator();

            while(var3.hasNext()) {
                Entry<Integer, List<IOrder>> entry = (Entry)var3.next();
                printTrasa = printTrasa + "\nZ regálu " + entry.getKey() + " vyzvednu:";

                IOrder o;
                for(Iterator var5 = ((List)entry.getValue()).iterator(); var5.hasNext(); printTrasa = printTrasa + "\n" + o.getName() + " " + o.getCount() + "x") {
                    o = (IOrder)var5.next();
                }

                String regal = "Regal_" + entry.getKey();
                Iterator var9 = this.rectangles.iterator();

                while(var9.hasNext()) {
                    Rectangle i = (Rectangle)var9.next();
                    if (regal.equals(i.getId().toString())) {
                        i.setFill(Color.GREEN);
                    }
                }
            }
        }

        this.labelTrasa.setText("Trasa:" + printTrasa);
    }

    @FXML
    public void giveOrder() {
        this.popup.setVisible(true);
        labelPopup.setText("Zaklikněte zboží, které chcete vyzvednout\na navolte počet");
        ArrayList<String> allGoodsTmp = new ArrayList<>();
        ArrayList<String> allGoods = new ArrayList<>();

        ArrayList<GoodsShelf> shelves = warehouse.getList();
        Iterator it = shelves.iterator();
        while (it.hasNext()) {
            GoodsShelf shelf = (GoodsShelf)it.next();
            allGoodsTmp.add(shelf.obsah());
        }

        it = allGoodsTmp.iterator();
        while (it.hasNext()) {
            String i = (String)it.next();
            String[] s = i.split(" ");
            for (int j = 0; j < s.length; j++) {
                allGoods.add(s[j]);
            }
        }
        allGoodsTmp.clear();
        int allGoodsSize = allGoods.size();
        for (int i = 0; i < allGoodsSize; i += 2) {
            allGoods.add(allGoods.get(i) + "-" + allGoods.get(i+1));
        }
        for (int i = 0; i < allGoodsSize; i++) {
            allGoods.remove(0);
        }
        Collections.sort(allGoods);
        for (String s: allGoods) {
            allGoodsTmp.add(s.substring(0, s.length() - 1));
        }

        for (String s: allGoodsTmp) {
            String[] ss = s.split("-");
            mapGoods.put(ss[0], Integer.parseInt(ss[1]) + mapGoods.getOrDefault(ss[0], 0));
        }

        ArrayList<String> keys = new ArrayList<>(mapGoods.keySet());
        ArrayList<Integer> values = new ArrayList<>(mapGoods.values());

        allGoods.clear();
        for (int i = 0; i < keys.size(); i++) {
            String add = keys.get(i) + " (" + values.get(i) + " ks)";
            allGoods.add(add);
        }

        ObservableList<String> items = FXCollections.observableArrayList();
        items.setAll(keys);
        listViewOrder.setItems(items);
        listViewOrder.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        labelOrder.setText("Objednavka:");
        SpinnerValueFactory<Integer> vf =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 100, 50);
        spinnerOrder.setValueFactory(vf);
        spinnerOrder.setEditable(true);
        /*from SO*/
        spinnerOrder.focusedProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue) {
                spinnerOrder.increment(0); // won't change value, but will commit editor
            }
        });
    }

    @FXML
    public void orderFromFile() {
        FileChooser fileChooser = new FileChooser();
        JSONParser parser = new JSONParser();
        File dir = new File("./data");
        fileChooser.setInitialDirectory(dir);

        fileChooser.setTitle("Vyberte soubor s příponou '.json'");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Soubory JSON", "*.json"));
        File orderFile = fileChooser.showOpenDialog(pane.getScene().getWindow());

        labelOrder.setText("Objednavka:\n" + orderFile.getName() + "\n(parse json tbd)");
    }

    @FXML
    public void addToOrder() {
        labelErrorPopup.setText("");
        ObservableList listViewOrderSelected = listViewOrder.getSelectionModel().getSelectedItems();
        int stock = mapGoods.get(listViewOrderSelected.get(0));
        if ( (Integer)spinnerOrder.getValue()  <= stock ) {
            this.orders.add(new Order((String)listViewOrderSelected.get(0), (Integer)spinnerOrder.getValue()));
            labelOrder.setText(labelOrder.getText() + "\n" + listViewOrderSelected.get(0) + ": " + spinnerOrder.getValue());
            mapGoods.put((String) listViewOrderSelected.get(0), stock - (Integer)spinnerOrder.getValue());
        } else {
            labelErrorPopup.setText("Ve skladu je pouze " + stock + " ks zboží " + listViewOrderSelected.get(0) + ".");
        }
    }

    @FXML
    public void saveOrder() {
        popup.setVisible(false);
        executeOrder();
    }

    @FXML
    public void closePopup() {
        this.popup.setVisible(false);
    }

    @FXML
    public void zoom(ScrollEvent event) {
        double zoomFactor = 1.05;
        double deltaY = event.getDeltaY();

        if (deltaY < 0) {
            zoomFactor = 0.95;
        }

        pane.setScaleX(pane.getScaleX() * zoomFactor);
        pane.setScaleY(pane.getScaleY() * zoomFactor);
        event.consume();
    }

    private Node selected;
    private Point2D translateStart;
    private Point2D offset;
    @FXML
    public void preDrag(MouseEvent event) {
        Node target = (Node) event.getTarget();
        if (target != pane) {
            selected = pane;
            offset = new Point2D(event.getX(), event.getY());
            translateStart = new Point2D(selected.getTranslateX(), selected.getTranslateY());
        } else {
            selected = pane;
        }
        event.consume();
    }

    @FXML
    public void drag(MouseEvent event) {
        if (selected != null) {
            selected.setTranslateX(event.getX() - offset.getX() + translateStart.getX());
            selected.setTranslateY(event.getY() - offset.getY() + translateStart.getY());
        }
        event.consume();
    }

    @FXML
    private Rectangle Regal_1;
    @FXML
    private Rectangle Regal_2;
    @FXML
    private Rectangle Regal_3;
    @FXML
    private Rectangle Regal_4;
    @FXML
    private Rectangle Regal_5;
    @FXML
    private Rectangle Regal_6;
    @FXML
    private Rectangle Regal_7;
    @FXML
    private Rectangle Regal_8;
    @FXML
    private Rectangle Regal_9;
    @FXML
    private Rectangle Regal_10;
    @FXML
    private Rectangle Regal_11;
    @FXML
    private Rectangle Regal_12;
    @FXML
    private Rectangle Regal_13;
    @FXML
    private Rectangle Regal_14;
    @FXML
    private Rectangle Regal_15;
    @FXML
    private Rectangle Regal_16;
    @FXML
    private Rectangle Regal_17;
    @FXML
    private Rectangle Regal_18;
    @FXML
    private Rectangle Regal_19;
    @FXML
    private Rectangle Regal_20;
    @FXML
    private Rectangle Regal_21;
    @FXML
    private Rectangle Regal_22;
    @FXML
    private Rectangle Regal_23;
    @FXML
    private Rectangle Regal_24;
    @FXML
    private Rectangle Regal_25;
    @FXML
    private Rectangle Regal_26;
    @FXML
    private Rectangle Regal_27;
    @FXML
    private Rectangle Regal_28;
    @FXML
    private Rectangle Regal_29;
    @FXML
    private Rectangle Regal_30;
    @FXML
    private Rectangle Regal_31;
    @FXML
    private Rectangle Regal_32;
    @FXML
    private Rectangle Regal_33;
    @FXML
    private Rectangle Regal_34;
    @FXML
    private Rectangle Regal_35;
    @FXML
    private Rectangle Regal_36;
    @FXML
    private Rectangle Regal_37;
    @FXML
    private Rectangle Regal_38;
    @FXML
    private Rectangle Regal_39;
    @FXML
    private Rectangle Regal_40;
    @FXML
    private Rectangle Regal_41;
    @FXML
    private Rectangle Regal_42;
    @FXML
    private Rectangle Regal_43;
    @FXML
    private Rectangle Regal_44;
    @FXML
    private Rectangle Regal_45;
    @FXML
    private Rectangle Regal_46;
    @FXML
    private Rectangle Regal_47;
    @FXML
    private Rectangle Regal_48;
    @FXML
    private Rectangle Regal_49;
    @FXML
    private Rectangle Regal_50;
    @FXML
    private Rectangle Regal_51;
    @FXML
    private Rectangle Regal_52;
    @FXML
    private Rectangle Regal_53;
    @FXML
    private Rectangle Regal_54;
    @FXML
    private Rectangle Regal_55;
    @FXML
    private Rectangle Regal_56;
    @FXML
    private Rectangle Regal_57;
    @FXML
    private Rectangle Regal_58;
    @FXML
    private Rectangle Regal_59;
    @FXML
    private Rectangle Regal_60;
    @FXML
    private Rectangle Regal_61;
    @FXML
    private Rectangle Regal_62;
    @FXML
    private Rectangle Regal_63;
    @FXML
    private Rectangle Regal_64;
    @FXML
    private Rectangle Regal_65;
    @FXML
    private Rectangle Regal_66;
    @FXML
    private Rectangle Regal_67;
    @FXML
    private Rectangle Regal_68;
    @FXML
    private Rectangle Regal_69;
    @FXML
    private Rectangle Regal_70;
    @FXML
    private Rectangle Regal_71;
    @FXML
    private Rectangle Regal_72;
    @FXML
    private Rectangle Regal_73;
    @FXML
    private Rectangle Regal_74;
    @FXML
    private Rectangle Regal_75;
    @FXML
    private Rectangle Regal_76;
    @FXML
    private Rectangle Regal_77;
    @FXML
    private Rectangle Regal_78;
    @FXML
    private Rectangle Regal_79;
    @FXML
    private Rectangle Regal_80;
    @FXML
    private Rectangle Regal_81;
    @FXML
    private Rectangle Regal_82;
    @FXML
    private Rectangle Regal_83;
    @FXML
    private Rectangle Regal_84;
    @FXML
    private Rectangle Regal_85;
    @FXML
    private Rectangle Regal_86;
    @FXML
    private Rectangle Regal_87;
    @FXML
    private Rectangle Regal_88;
    @FXML
    private Rectangle Regal_89;
    @FXML
    private Rectangle Regal_90;
    @FXML
    private Rectangle Regal_91;
    @FXML
    private Rectangle Regal_92;
    @FXML
    private Rectangle Regal_93;
    @FXML
    private Rectangle Regal_94;
    @FXML
    private Rectangle Regal_95;
    @FXML
    private Rectangle Regal_96;
    @FXML
    private Rectangle Regal_97;
    @FXML
    private Rectangle Regal_98;
    @FXML
    private Rectangle Regal_99;
    @FXML
    private Rectangle Regal_100;
    @FXML
    private Rectangle Regal_101;
    @FXML
    private Rectangle Regal_102;
    @FXML
    private Rectangle Regal_103;
    @FXML
    private Rectangle Regal_104;
    @FXML
    private Rectangle Regal_105;
    @FXML
    private Rectangle Regal_106;
    @FXML
    private Rectangle Regal_107;
    @FXML
    private Rectangle Regal_108;
    @FXML
    private Rectangle Regal_109;
    @FXML
    private Rectangle Regal_110;
    @FXML
    private Rectangle Regal_111;
    @FXML
    private Rectangle Regal_112;
    @FXML
    private Rectangle Regal_113;
    @FXML
    private Rectangle Regal_114;
    @FXML
    private Rectangle Regal_115;
    @FXML
    private Rectangle Regal_116;
    @FXML
    private Rectangle Regal_117;
    @FXML
    private Rectangle Regal_118;
    @FXML
    private Rectangle Regal_119;
    @FXML
    private Rectangle Regal_120;
    @FXML
    private Rectangle Regal_121;
    @FXML
    private Rectangle Regal_122;
    @FXML
    private Rectangle Regal_123;
    @FXML
    private Rectangle Regal_124;
    @FXML
    private Rectangle Regal_125;
    @FXML
    private Rectangle Regal_126;
    @FXML
    private Rectangle Regal_127;
    @FXML
    private Rectangle Regal_128;
    @FXML
    private Rectangle Regal_129;
    @FXML
    private Rectangle Regal_130;
    @FXML
    private Rectangle Regal_131;
    @FXML
    private Rectangle Regal_132;
    @FXML
    private Rectangle Regal_133;
    @FXML
    private Rectangle Regal_134;
    @FXML
    private Rectangle Regal_135;
    @FXML
    private Rectangle Regal_136;
    @FXML
    private Rectangle Regal_137;
    @FXML
    private Rectangle Regal_138;
    @FXML
    private Rectangle Regal_139;
    @FXML
    private Rectangle Regal_140;
    @FXML
    private Rectangle Regal_141;
    @FXML
    private Rectangle Regal_142;
    @FXML
    private Rectangle Regal_143;
    @FXML
    private Rectangle Regal_144;
    @FXML
    private Rectangle Regal_145;
    @FXML
    private Rectangle Regal_146;
    @FXML
    private Rectangle Regal_147;
    @FXML
    private Rectangle Regal_148;
    @FXML
    private Rectangle Regal_149;
    @FXML
    private Rectangle Regal_150;
    @FXML
    private Rectangle Regal_151;
    @FXML
    private Rectangle Regal_152;
    @FXML
    private Rectangle Regal_153;
    @FXML
    private Rectangle Regal_154;
    @FXML
    private Rectangle Regal_155;
    @FXML
    private Rectangle Regal_156;
    @FXML
    private Rectangle Regal_157;
    @FXML
    private Rectangle Regal_158;
    @FXML
    private Rectangle Regal_159;
    @FXML
    private Rectangle Regal_160;






}

