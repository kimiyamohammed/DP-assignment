/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dp_exe6;

/**
 *
 * @author hanun
 */
public class My_class2 implements My_Interface{

    private int a;
    private int b;

    @Override
    public int add(int a, int b) {
        a = this.a;
        b = this.b;
        return a + b;
    }
    
}
