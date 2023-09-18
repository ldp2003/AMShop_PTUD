package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class frmTrangChu extends JFrame {
	JButton btnDangNhap;
	DefaultTableModel model;
	JTable table;
	public frmTrangChu() {
		setTitle("AM Shop");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		Dimension miniumSize = new Dimension(1000,500);
		setMinimumSize(miniumSize);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		taoGUI();
	}
	
	private void taoGUI() {
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		add(panel);
		//Logo và đăng nhập
		Box bNorth = Box.createHorizontalBox();
		JPanel pnNorth = new JPanel();
		pnNorth.setLayout(new BoxLayout(pnNorth, BoxLayout.X_AXIS));
		Box bLogo = Box.createHorizontalBox();
		JLabel lbLogo = new JLabel("Logo");
		bLogo.add(lbLogo);
		bNorth.add(bLogo);
		bLogo.setAlignmentX(Component.LEFT_ALIGNMENT);
		bNorth.add(Box.createHorizontalGlue());
		Box bDangNhap = Box.createHorizontalBox();
		btnDangNhap = new JButton("Đăng nhập");
		bDangNhap.add(btnDangNhap);
		bNorth.add(bDangNhap);
		bDangNhap.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel.add(bNorth);
		
		panel.add(Box.createVerticalStrut(10));
		//Menu
		Box bCenter = Box.createHorizontalBox();
		JPanel pnCenter = new JPanel();
		pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.X_AXIS));
		Box bMenu = Box.createHorizontalBox();
		
		JButton btnTongQuan, btnHangHoa, btnGiaoDich, btnDoiTac, btnNhanVien, btnSoQuy, btnBaoCao;
		btnTongQuan = new JButton("Tổng Quan");
		btnHangHoa = new JButton("Hàng Hóa");
		btnGiaoDich = new JButton("Giao Dịch");
		btnDoiTac = new JButton("Đối Tác");
		btnNhanVien = new JButton("Nhân Viên");
		btnSoQuy = new JButton("Sổ Quỹ");
		btnBaoCao = new JButton("Báo Cáo");
		bMenu.add(btnTongQuan);
		bMenu.add(btnHangHoa);
		bMenu.add(btnGiaoDich);
		bMenu.add(btnDoiTac);
		bMenu.add(btnNhanVien);
		bMenu.add(btnSoQuy);
		bMenu.add(btnBaoCao);
		pnCenter.add(bMenu);
		bMenu.setAlignmentX(Component.LEFT_ALIGNMENT);
		pnCenter.add(Box.createHorizontalGlue());
		Box bBanHang = Box.createHorizontalBox();
		JButton btnBanHang = new JButton("Bán Hàng");
		bBanHang.add(btnBanHang);
		pnCenter.add(bBanHang);
		bBanHang.setAlignmentX(Component.RIGHT_ALIGNMENT);
		bCenter.add(pnCenter);
		panel.add(bCenter);
		
		pnCenter.setBackground(Color.cyan);
		panel.add(Box.createVerticalStrut(10));
		btnHangHoa.setPreferredSize(btnTongQuan.getPreferredSize());
		btnDoiTac.setPreferredSize(btnTongQuan.getPreferredSize());
		btnSoQuy.setPreferredSize(btnTongQuan.getPreferredSize());
		btnBaoCao.setPreferredSize(btnTongQuan.getPreferredSize());
		btnTongQuan.setBackground(Color.blue);
		btnTongQuan.setForeground(Color.white);
		btnHangHoa.setBackground(Color.blue);
		btnHangHoa.setForeground(Color.white);
		btnGiaoDich.setBackground(Color.blue);
		btnGiaoDich.setForeground(Color.white);
		btnDoiTac.setBackground(Color.blue);
		btnDoiTac.setForeground(Color.white);
		btnNhanVien.setBackground(Color.blue);
		btnNhanVien.setForeground(Color.white);
		btnSoQuy.setBackground(Color.blue);
		btnSoQuy.setForeground(Color.white);
		btnBaoCao.setBackground(Color.blue);
		btnBaoCao.setForeground(Color.white);
		btnBanHang.setBackground(Color.blue);
		btnBanHang.setForeground(Color.white);
		//Panel làm việc
		//Chưa hoàn thiện, cần thêm sau
		Box bSouth = Box.createHorizontalBox();
		JPanel pnSouth = new JPanel();
		pnSouth.setBackground(Color.green);
		bSouth.add(pnSouth);
		panel.add(bSouth);
	}
	
	public static void main(String[] args) {
		frmTrangChu trangChu = new frmTrangChu();
		trangChu.setVisible(true);
	}

}