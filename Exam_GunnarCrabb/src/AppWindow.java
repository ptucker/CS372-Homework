import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.wb.swt.SWTResourceManager;





public class AppWindow {

	

	

	protected Shell shlExamApplication;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			AppWindow window = new AppWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	Fileio openfile = new Fileio();
	ArrayList<Shape> shapes = openfile.getList();

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlExamApplication.open();
		shlExamApplication.layout();
		while (!shlExamApplication.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlExamApplication = new Shell();
		shlExamApplication.setSize(1000, 500);
		shlExamApplication.setText("Shape Application");
		
		Table tblSidebar = new Table(shlExamApplication, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
		tblSidebar.setBounds(0, 0, 250, 473);
		tblSidebar.setLinesVisible(true);
		
		Label lblStats = new Label(shlExamApplication, SWT.NONE);
		lblStats.setBounds(590, 0, 392, 203);
		lblStats.setText("No Items Selected.");
		
		Label lblImage = new Label(shlExamApplication, SWT.CENTER);
		lblImage.setImage(SWTResourceManager.getImage(AppWindow.class, "/resources/noImage.jpg"));
		lblImage.setBounds(590, 209, 382, 244);
		for (int i = 0; i < shapes.size(); i++) {
			TableItem item = new TableItem(tblSidebar, 0);
			item.setText((shapes.get(i)).toString());
		}
		
		tblSidebar.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event e) {
				String string = "";
				int selection = tblSidebar.getSelectionIndex();
				string += (shapes.get(selection)).getDetailString() + "\n";
				lblStats.setText(string);
				if (shapes.get(selection) instanceof Square) {
					lblImage.setImage(SWTResourceManager.getImage(AppWindow.class, "/resources/square.png"));
				}
				if (shapes.get(selection) instanceof Circle) {
					lblImage.setImage(SWTResourceManager.getImage(AppWindow.class, "/resources/circle.jpg"));
				}
				if (shapes.get(selection) instanceof Triangle) {
					lblImage.setImage(SWTResourceManager.getImage(AppWindow.class, "/resources/triangle.png"));
				}
				if (shapes.get(selection) instanceof Rectangle) {
					lblImage.setImage(SWTResourceManager.getImage(AppWindow.class, "/resources/Rectangle.png"));
				}
			}
			
		});
		

	}
}
