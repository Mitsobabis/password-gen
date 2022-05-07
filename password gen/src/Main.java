import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static java.util.List<String> getList1() {
        return Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");
    }

    public static java.util.List<String> getList2() {
        return Arrays.asList("_", "-", ":", ";", ",", "!", "@", "#", "$", "`", "~", "%", "^", "&", "*", "/", "?", ".", "<", ">", "[", "]", "|", "+", "=");
    }

    public static java.util.List<Integer> getList3() {
        return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
    }

    public static String getRngPassword() {
        Random rand = new Random();
        int matches = 0;

        var a = getList1().get(rand.nextInt(getList1().size()));
        var b = getList1().get(rand.nextInt(getList1().size()));
        if (a.equals(b)) matches = matches + 1;
        var c = getList2().get(rand.nextInt(getList2().size()));
        if (b.equals(c) || c.equals(a)) matches = matches + 1;
        var d = getList1().get(rand.nextInt(getList1().size()));
        if (c.equals(d) || d.equals(a) || d.equals(b)) matches = matches + 1;
        var e = getList3().get(rand.nextInt(getList3().size()));
        if (d.equals(e.toString()) || e.toString().equals(a) || e.toString().equals(b) || e.toString().equals(c))
            matches = matches + 1;
        var f = getList3().get(rand.nextInt(getList3().size()));
        if (e.equals(f) || f.toString().equals(a) || f.toString().equals(b) || f.toString().equals(c) || f.toString().equals(d))
            matches = matches + 1;
        var g = getList2().get(rand.nextInt(getList2().size()));
        if (f.toString().equals(g) || g.equals(a) || g.equals(b) || g.equals(c) || g.equals(d) || g.equals(e.toString()))
            matches = matches + 1;
        var h = getList3().get(rand.nextInt(getList3().size()));
        if (g.equals(h.toString()) || h.toString().equals(a) || h.toString().equals(b) || h.toString().equals(c) || h.toString().equals(d) || h.equals(e) || h.equals(f))
            matches = matches + 1;
        var i = getList1().get(rand.nextInt(getList1().size()));
        if (h.toString().equals(i) || i.equals(a) || i.equals(b) || i.equals(c) || i.equals(d) || i.equals(e.toString()) || i.equals(f.toString()) || i.equals(g))
            matches = matches + 1;
        var j = getList2().get(rand.nextInt(getList2().size()));
        if (i.equals(j) || j.equals(a) || j.equals(b) || j.equals(c) || j.equals(d) || j.equals(e.toString()) || j.equals(f.toString()) || j.equals(g) || j.equals(h.toString()))
            matches = matches + 1;
        var k = getList1().get(rand.nextInt(getList1().size()));
        if (j.equals(k) || k.equals(a) || k.equals(b) || k.equals(c) || k.equals(d) || k.equals(e.toString()) || k.equals(f.toString()) || k.equals(g) || k.equals(h.toString()) || k.equals(i))
            matches = matches + 1;
        var l = getList3().get(rand.nextInt(getList3().size()));
        if (k.equals(l.toString()) || l.toString().equals(a) || l.toString().equals(b) || l.toString().equals(c) || l.toString().equals(d) || l.equals(e) || l.equals(f) || l.toString().equals(g) || l.equals(h) || l.toString().equals(i) || l.toString().equals(j))
            matches = matches + 1;
        var m = getList2().get(rand.nextInt(getList2().size()));
        if (l.toString().equals(m) || m.equals(a) || m.equals(b) || m.equals(c) || m.equals(d) || m.equals(e.toString()) || m.equals(f.toString()) || m.equals(g) || m.equals(h.toString()) || m.equals(i) || m.equals(j) || m.equals(k))
            matches = matches + 1;
        var n = getList1().get(rand.nextInt(getList1().size()));
        if (m.equals(n) || n.equals(a) || n.equals(b) || n.equals(c) || n.equals(d) || n.equals(e.toString()) || n.equals(f.toString()) || n.equals(g) || n.equals(h.toString()) || n.equals(i) || n.equals(j) || n.equals(k) || n.equals(l.toString()))
            matches = matches + 1;
        var o = getList3().get(rand.nextInt(getList3().size()));
        if (n.equals(o.toString()) || o.toString().equals(a) || o.toString().equals(b) || o.toString().equals(c) || o.toString().equals(d) || o.equals(e) || o.equals(f) || o.toString().equals(g) || o.equals(h) || o.toString().equals(i) || o.toString().equals(j) || o.toString().equals(k) || o.equals(l) || o.toString().equals(m))
            matches = matches + 1;
        var p = getList3().get(rand.nextInt(getList3().size()));
        if (o.equals(p) || p.toString().equals(a) || p.toString().equals(b) || p.toString().equals(c) || p.toString().equals(d) || p.equals(e) || p.equals(f) || p.toString().equals(g) || p.equals(h) || p.toString().equals(i) || p.toString().equals(j) || p.toString().equals(k) || p.equals(l) || p.toString().equals(m) || p.toString().equals(n))
            matches = matches + 1;
        System.out.println("Starting numbers: \n                -" + a + "\n                -" + b + "\n                -" + c + "\n                -" + d + "\n                -" + e + "\n                -" + f + "\n                -" + g + "\n                -" + h + "\n                -" + i + "\n                -" + j + "\n                -" + k + "\n                -" + l + "\n                -" + m + "\n                -" + n + "\n                -" + o + "\n                -" + p);
        if (matches > 0) {
            System.out.println("-------------------------------------------------------------------------------\n[LOG] There were some matches found(" + matches + "). Correcting...\n-------------------------------------------------------------------------------");
        }
        while (matches > 0) {
            a = getList1().get(rand.nextInt(getList1().size()));
            b = getList1().get(rand.nextInt(getList1().size()));
            c = getList2().get(rand.nextInt(getList2().size()));
            d = getList1().get(rand.nextInt(getList1().size()));
            e = getList3().get(rand.nextInt(getList3().size()));
            f = getList3().get(rand.nextInt(getList3().size()));
            g = getList2().get(rand.nextInt(getList2().size()));
            h = getList3().get(rand.nextInt(getList3().size()));
            i = getList1().get(rand.nextInt(getList1().size()));
            j = getList2().get(rand.nextInt(getList2().size()));
            k = getList1().get(rand.nextInt(getList1().size()));
            l = getList3().get(rand.nextInt(getList3().size()));
            m = getList2().get(rand.nextInt(getList2().size()));
            n = getList1().get(rand.nextInt(getList1().size()));
            o = getList3().get(rand.nextInt(getList3().size()));
            p = getList3().get(rand.nextInt(getList3().size()));
            if (!a.equals(b) && !b.equals(c) && !c.equals(a) && !c.equals(d) && !d.equals(a) && !d.equals(b) && !d.equals(e.toString()) && !e.toString().equals(a) && !e.toString().equals(b) && !e.toString().equals(c) && !e.equals(f) && !f.toString().equals(a) && !f.toString().equals(b) && !f.toString().equals(c) && !f.toString().equals(d) && !f.toString().equals(g) && !g.equals(a) && !g.equals(b) && !g.equals(c) && !g.equals(d) && !g.equals(e.toString()) && !g.equals(h.toString()) && !h.toString().equals(a) && !h.toString().equals(b) && !h.toString().equals(c) && !h.toString().equals(d) && !h.equals(e) && !h.equals(f) && !h.toString().equals(i) && !i.equals(a) && !i.equals(b) && !i.equals(c) && !i.equals(d) && !i.equals(e.toString()) && !i.equals(f.toString()) && !i.equals(g) && !i.equals(j) && !j.equals(a) && !j.equals(b) && !j.equals(c) && !j.equals(d) && !j.equals(e.toString()) && !j.equals(f.toString()) && !j.equals(g) && !j.equals(h.toString()) && !j.equals(k) && !k.equals(a) && !k.equals(b) && !k.equals(c) && !k.equals(d) && !k.equals(e.toString()) && !k.equals(f.toString()) && !k.equals(g) && !k.equals(h.toString()) && !k.equals(i) && !k.equals(l.toString()) && !l.toString().equals(a) && !l.toString().equals(b) && !l.toString().equals(c) && !l.toString().equals(d) && !l.equals(e) && !l.equals(f) && !l.toString().equals(g) && !l.equals(h) && !l.toString().equals(i) && !l.toString().equals(j) && !l.toString().equals(m) && !m.equals(a) && !m.equals(b) && !m.equals(c) && !m.equals(d) && !m.equals(e.toString()) && !m.equals(f.toString()) && !m.equals(g) && !m.equals(h.toString()) && !m.equals(i) && !m.equals(j) && !m.equals(k) && !m.equals(n) && !n.equals(a) && !n.equals(b) && !n.equals(c) && !n.equals(d) && !n.equals(e.toString()) && !n.equals(f.toString()) && !n.equals(g) && !n.equals(h.toString()) && !n.equals(i) && !n.equals(j) && !n.equals(k) && !n.equals(l.toString()) && !n.equals(o.toString()) && !o.toString().equals(a) && !o.toString().equals(b) && !o.toString().equals(c) && !o.toString().equals(d) && !o.equals(e) && !o.equals(f) && !o.toString().equals(g) && !o.equals(h) && !o.toString().equals(i) && !o.toString().equals(j) && !o.toString().equals(k) && !o.equals(l) && !o.toString().equals(m) && !o.equals(p) && !p.toString().equals(a) && !p.toString().equals(b) && !p.toString().equals(c) && !p.toString().equals(d) && !p.equals(e) && !p.equals(f) && !p.toString().equals(g) && !p.equals(h) && !p.toString().equals(i) && !p.toString().equals(j) && !p.toString().equals(k) && !p.equals(l) && !p.toString().equals(m) && !p.toString().equals(n)) {
                matches = 0;
            }
        }



        List<? extends Serializable> list = Arrays.asList(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p);
        System.out.println("Correction: " + list.toString() + "\n-------------------------------------------------------------------------------");
        List<String> list2 = Arrays.asList("0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0");

        int repeats = 0;
        int index = 0;

        var x1 = a;
        var x2 = b;
        var x3 = c;
        var x4 = d;
        var x5 = e.toString();
        var x6 = f.toString();
        var x7 = g;
        var x8 = h.toString();
        var x9 = i;
        var x10 = j;
        var x11 = k;
        var x12 = l.toString();
        var x13 = m;
        var x14 = n;
        var x15 = o.toString();
        var x16 = p.toString();
        List<String> list3 = Arrays.asList(x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12,x13,x14,x15,x16,"0");

        while (repeats < 16) {
            var x = list3.get(rand.nextInt(list.size()));
            repeats = repeats + 1;
            index = index + 1;
            System.out.println("[LOG] On List2 | index: " + index + " | value: " + list2.get(index) + " | was changed to: " + x + " | Repeat Number: " + repeats);
            list2.set(index, x);
        }
        int repeats2 = 0;
        System.out.println("-------------------------------------------------------------------------------\nList2 is now:" + list2.toString());
        System.out.println("-------------------------------------------------------------------------------");
        var a1 = list2.get(1);
        System.out.println("[LOG] a1 was set to: " + a1);
        var a2 = list2.get(2);
        if(a2.equals(a1)) repeats2 = repeats2 + 1;
        System.out.println("[LOG] a2 was set to: " + a2);
        var a3 = list2.get(3);
        if(a3.equals(a1) || a3.equals(a2)) repeats2 = repeats2 + 1;
        System.out.println("[LOG] a3 was set to: " + a3);
        var a4 = list2.get(4);
        if(a4.equals(a1) || a4.equals(a2) || a4.equals(a3)) repeats2 = repeats2 + 1;
        System.out.println("[LOG] a4 was set to: " + a4);
        var a5 = list2.get(5);
        if(a5.equals(a1) || a5.equals(a2) || a5.equals(a3) || a5.equals(a4)) repeats2 = repeats2 + 1;
        System.out.println("[LOG] a5 was set to: " + a5);
        var a6 = list2.get(6);
        if(a6.equals(a1) || a6.equals(a2) || a6.equals(a3) || a6.equals(a4) || a6.equals(a5)) repeats2 = repeats2 + 1;
        System.out.println("[LOG] a6 was set to: " + a6);
        var a7 = list2.get(7);
        if(a7.equals(a1) || a7.equals(a2) || a7.equals(a3) || a7.equals(a4) || a7.equals(a5) || a7.equals(a6)) repeats2 = repeats2 + 1;
        System.out.println("[LOG] a7 was set to: " + a7);
        var a8 = list2.get(8);
        if(a8.equals(a1) || a8.equals(a2) || a8.equals(a3) || a8.equals(a4) || a8.equals(a5) || a8.equals(a6) || a8.equals(a7)) repeats2 = repeats2 + 1;
        System.out.println("[LOG] a8 was set to: " + a8);
        var a9 = list2.get(9);
        if(a9.equals(a1) || a9.equals(a2) || a9.equals(a3) || a9.equals(a4) || a9.equals(a5) || a9.equals(a6) || a9.equals(a7) || a9.equals(a8)) repeats2 = repeats2 + 1;
        System.out.println("[LOG] a9 was set to: " + a9);
        var a10 = list2.get(10);
        if(a10.equals(a1) || a10.equals(a2) || a10.equals(a3) || a10.equals(a4) || a10.equals(a5) || a10.equals(a6) || a10.equals(a7) || a10.equals(a8) || a10.equals(a9)) repeats2 = repeats2 + 1;
        System.out.println("[LOG] a10 was set to: " + a10);
        var a11 = list2.get(11);
        if(a11.equals(a1) || a11.equals(a2)|| a11.equals(a3) || a11.equals(a4) || a11.equals(a5) || a11.equals(a6) || a11.equals(a7) || a11.equals(a8) || a11.equals(a9) || a11.equals(a10)) repeats2 = repeats2 + 1;
        System.out.println("[LOG] a11 was set to: " + a11);
        var a12 = list2.get(12);
        if(a12.equals(a1) || a12.equals(a2) || a12.equals(a3) || a12.equals(a4) || a12.equals(a5) || a12.equals(a6) || a12.equals(a7) || a12.equals(a8) || a12.equals(a9) || a12.equals(a10) || a12.equals(a11)) repeats2 = repeats2 + 1;
        System.out.println("[LOG] a12 was set to: " + a12);
        var a13 = list2.get(13);
        if(a13.equals(a1) || a13.equals(a2) || a13.equals(a3) || a13.equals(a4) || a13.equals(a5) || a13.equals(a6) || a13.equals(a7) || a13.equals(a8) || a13.equals(a9) || a13.equals(a10) || a13.equals(a11) || a13.equals(a12)) repeats2 = repeats2 + 1;
        System.out.println("[LOG] a13 was set to: " + a13);
        var a14 = list2.get(14);
        if(a14.equals(a1) || a14.equals(a2) || a14.equals(a3) || a14.equals(a4) || a14.equals(a5) || a14.equals(a6) || a14.equals(a7) || a14.equals(a8) || a14.equals(a9) || a14.equals(a10) || a14.equals(a11) || a14.equals(a12) || a14.equals(a13)) repeats2 = repeats2 + 1;
        System.out.println("[LOG] a14 was set to: " + a14);
        var a15 = list2.get(15);
        if(a15.equals(a1) || a15.equals(a2) || a15.equals(a3) || a15.equals(a4) || a15.equals(a5) || a15.equals(a6) || a15.equals(a7) || a15.equals(a8) || a15.equals(a9) || a15.equals(a10) || a15.equals(a11) || a15.equals(a12) || a15.equals(a13) || a15.equals(a14)) repeats2 = repeats2 + 1;
        System.out.println("[LOG] a15 was set to: " + a15);
        var a16 = list2.get(16);
        if(a16.equals(a1) || a16.equals(a2) || a16.equals(a3) || a16.equals(a4) || a16.equals(a5) || a16.equals(a6) || a16.equals(a7) || a16.equals(a8) || a16.equals(a9) || a16.equals(a10) || a16.equals(a11) || a16.equals(a12) || a16.equals(a13) || a16.equals(a14) || a16.equals(a15)) repeats2 = repeats2 + 1;
        System.out.println("[LOG] a16 was set to: " + a16);
        if(repeats2 > 0){
            System.out.println("-------------------------------------------------------------------------------\n[LOG] There were some matches found(" + repeats2 + "). Correcting...\n-------------------------------------------------------------------------------");
        }
        while(repeats2 > 0){
            a1 = list3.get(rand.nextInt(list3.size()));
            a2 = list3.get(rand.nextInt(list3.size()));
            a3 = list3.get(rand.nextInt(list3.size()));
            a4 = list3.get(rand.nextInt(list3.size()));
            a5 = list3.get(rand.nextInt(list3.size()));
            a6 = list3.get(rand.nextInt(list3.size()));
            a7 = list3.get(rand.nextInt(list3.size()));
            a8 = list3.get(rand.nextInt(list3.size()));
            a9 = list3.get(rand.nextInt(list3.size()));
            a10 = list3.get(rand.nextInt(list3.size()));
            a11 = list3.get(rand.nextInt(list3.size()));
            a12 = list3.get(rand.nextInt(list3.size()));
            a13 = list3.get(rand.nextInt(list3.size()));
            a14 = list3.get(rand.nextInt(list3.size()));
            a15 = list3.get(rand.nextInt(list3.size()));
            a16 = list3.get(rand.nextInt(list3.size()));
            if(!a2.equals(a1) && !a3.equals(a1) && !a3.equals(a2) && !a4.equals(a1) && !a4.equals(a2) && !a4.equals(a3) && !a5.equals(a1) && !a5.equals(a2) && !a5.equals(a3) && !a5.equals(a4) && !a6.equals(a1) && !a6.equals(a2) && !a6.equals(a3) && !a6.equals(a4) && !a6.equals(a5) && !a7.equals(a1) && !a7.equals(a2) && !a7.equals(a3) && !a7.equals(a4) && !a7.equals(a5) && !a7.equals(a6) && !a8.equals(a1) && !a8.equals(a2) && !a8.equals(a3) && !a8.equals(a4) && !a8.equals(a5) && !a8.equals(a6) && !a8.equals(a7) && !a9.equals(a1) && !a9.equals(a2) && !a9.equals(a3) && !a9.equals(a4) && !a9.equals(a5) && !a9.equals(a6) && !a9.equals(a7) && !a9.equals(a8) && !a10.equals(a1) && !a10.equals(a2) && !a10.equals(a3) && !a10.equals(a4) && !a10.equals(a5) && !a10.equals(a6) && !a10.equals(a7) && !a10.equals(a8) && !a10.equals(a9) && !a11.equals(a1) && !a11.equals(a2)&& !a11.equals(a3) && !a11.equals(a4) && !a11.equals(a5) && !a11.equals(a6) && !a11.equals(a7) && !a11.equals(a8) && !a11.equals(a9) && !a11.equals(a10) && !a12.equals(a1) && !a12.equals(a2) && !a12.equals(a3) && !a12.equals(a4) && !a12.equals(a5) && !a12.equals(a6) && !a12.equals(a7) && !a12.equals(a8) && !a12.equals(a9) && !a12.equals(a10) && !a12.equals(a11) && !a13.equals(a1) && !a13.equals(a2) && !a13.equals(a3) && !a13.equals(a4) && !a13.equals(a5) && !a13.equals(a6) && !a13.equals(a7) && !a13.equals(a8) && !a13.equals(a9) && !a13.equals(a10) && !a13.equals(a11) && !a13.equals(a12) && !a14.equals(a1) && !a14.equals(a2) && !a14.equals(a3) && !a14.equals(a4) && !a14.equals(a5) && !a14.equals(a6) && !a14.equals(a7) && !a14.equals(a8) && !a14.equals(a9) && !a14.equals(a10) && !a14.equals(a11) && !a14.equals(a12) && !a14.equals(a13) && !a15.equals(a1) && !a15.equals(a2) && !a15.equals(a3) && !a15.equals(a4) && !a15.equals(a5) && !a15.equals(a6) && !a15.equals(a7) && !a15.equals(a8) && !a15.equals(a9) && !a15.equals(a10) && !a15.equals(a11) && !a15.equals(a12) && !a15.equals(a13) && !a15.equals(a14) && !a16.equals(a1) && !a16.equals(a2) && !a16.equals(a3) && !a16.equals(a4) && !a16.equals(a5) && !a16.equals(a6) && !a16.equals(a7) && !a16.equals(a8) && !a16.equals(a9) && !a16.equals(a10) && !a16.equals(a11) && !a16.equals(a12) && !a16.equals(a13) && !a16.equals(a14) && !a16.equals(a15)){
                repeats2 = 0;
            }
        }

        System.out.println("Correction: [" + a1 + "," + a2 + "," + a3 + "," + a4 + "," + a5 + "," + a6 + "," + a7 + "," + a8 + "," + a9 + "," + a10 + "," + a11 + "," + a12 + "," + a13 + "," + a14 + "," + a15 + "," + a16 + "]" + "\n-------------------------------------------------------------------------------");

        String copy = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16;
        StringSelection copyselect = new StringSelection(copy);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(copyselect, null);

        return "Generated Password: " + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12 + a13 + a14 + a15 + a16 + " and is saved to clipboard.";
    }

    public static void main (String[]args){
            new redirect();
        }
    }