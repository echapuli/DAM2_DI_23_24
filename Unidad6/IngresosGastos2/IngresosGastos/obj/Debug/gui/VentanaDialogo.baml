   M S B A M L   `   `   `  ����  IngresosGastos'    !IngresosGastos.gui.VentanaDialogo   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	     � Title$*  $Alta / Modificación Ingresos Gastos��5   	   $	��184��65   $	��594��6B    � 
ResizeMode$ NoResize=�6N    � WindowStartupLocation$ CenterScreen=�6d   .��5      � $��0,0,-8,0q�6   .+�5   
   �� $��Fecha:��6   $
��Left=�6!   $��10,0,0,102.667q�6<   $��Bottom=�6T   $��43��6o   �� 5   
   $
��Left=�6   $��70,0,0,98.667q�6+   $��Bottom=�6B   $	��129��6]    J� RenderTransformOrigin$ 0.596,0.471&�6i   .��5      (  "System.Windows.Controls.DatePicker  -   5          Name$ DPFecha��5      $	��116��6*   $��Center=�66   5	      �� 5
   
   $��	Concepto:��6   $
��Left=�6$   $��194,0,0,104.667q�6?   $��Bottom=�6X   $��63��6s   �� 5   
   -   5         ��Name$ 
TBConcepto��5      $��27��6&   $��262,0,22.334,103.667q�62    �� TextWrapping$
 Wrap=�6P   $��Bottom=�6d   $��Center=�6   $��2��6�   �� 5   
   $��Importe:��6   $
��Left=�6#   $��10,0,0,73.667q�6>   $��Bottom=�6U   �� 5   
   -   5        $ 	TBImporte��5      $��23��6%   $��70,0,0,74.667q�61   $�� ��6H   $��Bottom=�6P   $	��129��6k   $
��Left=�6w    �� TextAlignment$ Right=�6�   $��Center=�6�   $��Right=�6�   �� 5   
   -   5         ��Name$ 	BInsertar��5      $��Insertar��6$   $��10,0,0,9q�67   $��20��6I   $��Bottom=�6U   $
��Left=�6p   $��75��6�   6�   �� 5   
   -   5        $ 	BCancelar��5      $��Cancelar��6$   $��99,0,0,9q�67   $��20��6I   $��Bottom=�6U   $
��Left=�6p   $��75��6�   6�   �� 5   
   -   5        	 ��Name$	 LBError��5      $�� ��6!   $��Center=�6,   $
��Left=�6P   $��	10,86,0,0q�6k   $	��Top=�6~   $ -0.105,-0.231&�6�   $	��564��6�   ���	#FFFD05056�   5      5      